package com.khojo.services;

import com.khojo.domain.Places;

import java.util.Map;

/**
 * Created by narendrakumar on 5/4/17.
 */
public interface GooglePlace {
    Places getNearestParkData(String loc);
    Map<Double,String> nearestParkToMe(String loc);
}
