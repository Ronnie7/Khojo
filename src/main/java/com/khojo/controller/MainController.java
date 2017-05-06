package com.khojo.controller;

import com.khojo.domain.DefaultGeo;
import com.khojo.domain.FormAttr;
import com.khojo.services.GeoLocation;
import com.khojo.services.GooglePlace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by narendrakumar on 5/4/17.
 */
@Controller
public class MainController {
    private GeoLocation geoLocation;
    private GooglePlace googlePlace;


    @Autowired
    public MainController(GeoLocation geoLocation, GooglePlace googlePlace) {
        this.geoLocation = geoLocation;
        this.googlePlace = googlePlace;
    }

    @RequestMapping("/")
    public String index(Model model) {
        DefaultGeo defaultGeo = this.geoLocation.getMyIP();
        Map<Double, String> treeMap = this.googlePlace.closestParkToMe(defaultGeo.getLoc());
        model.addAttribute("defaultGeo", defaultGeo);
        model.addAttribute("treeMap", treeMap);
        return "index";
    }

    @PostMapping("/parks")
    public String index(@ModelAttribute FormAttr formAttr, Model model) {
        if (formAttr.getLoc().length() == 0) {
            return "redirect:";
        }
        Map<Double, String> treeMap = this.googlePlace.closestParkToMe(formAttr.getLoc());
        model.addAttribute("treeMap", treeMap);
        return "parks";
    }

}
