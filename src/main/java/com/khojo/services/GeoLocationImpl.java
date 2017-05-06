package com.khojo.services;

import com.khojo.domain.DefaultGeo;
import org.springframework.stereotype.Service;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

/**
 * Created by narendrakumar on 5/4/17.
 */

@Service
public class GeoLocationImpl implements GeoLocation {

    @Override
    public DefaultGeo getMyIP() {
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.setErrorHandler(new DefaultResponseErrorHandler());
            return restTemplate.getForObject("http://ipinfo.io/json", DefaultGeo.class);
    }
}
