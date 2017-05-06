package com.khojo.controller;

import com.khojo.services.GooglePlace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by narendrakumar on 5/4/17.
 */


@Controller
@RequestMapping
public class RestController {

    private GooglePlace googlePlace;

    @Autowired
    public RestController(GooglePlace googlePlace) {
        this.googlePlace = googlePlace;
    }

    @RequestMapping(value = "/json/{loc}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public
    @ResponseBody
    Map getNewsById(@PathVariable("loc") String loc) {
        return googlePlace.closestParkToMe(loc);
    }

}
