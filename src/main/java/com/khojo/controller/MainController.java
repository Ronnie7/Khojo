package com.khojo.controller;

import com.khojo.domain.DefaultGeo;
import com.khojo.domain.FormAttr;
import com.khojo.domain.JsonData;
import com.khojo.services.GeoLocation;
import com.khojo.services.GooglePlace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by narendrakumar on 5/4/17.
 */
@Controller
public class MainController {
    private final GeoLocation geoLocation;
    private final GooglePlace googlePlace;


    @Autowired
    public MainController(GeoLocation geoLocation, GooglePlace googlePlace) {
        this.geoLocation = geoLocation;
        this.googlePlace = googlePlace;
    }

    @RequestMapping("/")
    public String index(Model model) {
        DefaultGeo defaultGeo = this.geoLocation.getMyIP();
        List<JsonData> list = this.googlePlace.nearestParkToMe(defaultGeo.getLoc());
        model.addAttribute("defaultGeo", defaultGeo);
        model.addAttribute("list", list);
        return "index";
    }

    @PostMapping("/parks")
    public String index(@ModelAttribute FormAttr formAttr, Model model) {
        if (formAttr.getLoc().length() == 0) {
            return "redirect:";
        }
        List<JsonData> list = this.googlePlace.nearestParkToMe(formAttr.getLoc());
        model.addAttribute("list", list);
        return "parks";
    }

}
