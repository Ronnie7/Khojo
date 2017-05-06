package com.khojo.controller;

import com.khojo.domain.JsonData;
import com.khojo.services.GooglePlace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by narendrakumar on 5/4/17.
 */


@Controller
@RequestMapping
public class RestController {
    private final GooglePlace googlePlace;
    @Autowired
    public RestController(GooglePlace googlePlace) {
        this.googlePlace = googlePlace;
    }

    @RequestMapping(value = "/json/{loc}/get", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<JsonData> getDataByLoc(@PathVariable("loc") String loc) {
        return googlePlace.nearestParkToMe(loc);
    }

}
