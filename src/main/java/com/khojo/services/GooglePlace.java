package com.khojo.services;

import com.khojo.domain.Places;

import java.util.Map;

/**
 * Created by narendrakumar on 5/4/17.
 */
public interface GooglePlace {
    public Places getNearestParkData(String loc);
    public Map<Double,String> closestParkToMe(String loc);
}
