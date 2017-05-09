package com.khojo.services;

import com.khojo.domain.JsonData;
import com.khojo.domain.Location;
import com.khojo.domain.Places;
import com.khojo.domain.Results;
import org.springframework.stereotype.Service;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by narendrakumar on 5/4/17.
 */
@Service
public class GooglePlacesImpl implements GooglePlace {

    @Override
    public Places getNearestParkData(String loc){
        String url = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location="+loc+"&radius=16093.4&type=park&keyword=public&key=AIzaSyCKuDYYADz1E28wiMn8SB8EowqJFI-yQEg";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setErrorHandler(new DefaultResponseErrorHandler());
        return restTemplate.getForObject(url,Places.class);
    }

    @Override
    public List nearestParkToMe(String currentPosition) {
        Map<Double,JsonData> sortedNearestPark = new TreeMap<>();//store shorted value.
        for (Results result:getNearestParkData(currentPosition).getResults()) {
            Double distance = getDistanceFrom(currentPosition, result.getGeometry().getLocation());
            JsonData jsonData = new JsonData();
            jsonData.setMiles(distance);
            jsonData.setName(result.getName());
            sortedNearestPark.put(jsonData.getMiles(),jsonData);
        }
        return (List) sortedNearestPark.values();
    }

    private Double getDistanceFrom(String currentPosition, Location thisLocation) {
        String[] position = currentPosition.split(",");
        return distance(Double.valueOf(position[0]),Double.valueOf(position[1]), thisLocation.getLat() , thisLocation.getLng());
    }

    private Double distance(double lat1, double lon1,double lat2, double lon2) {
        final int R = 6371; // Radius of the earth
        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; // convert to meters
        distance = Math.pow(distance, 2) + Math.pow(0,2);
        return  (Math.sqrt(distance)) / 1609.344;
    }
}
