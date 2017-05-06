package com.khojo.services;

import com.khojo.domain.Places;

import java.util.List;
import java.util.Map;

/**
 * Created by narendrakumar on 5/4/17.
 */
public interface GooglePlace {
    Places getNearestParkData(String loc);
    List nearestParkToMe(String loc);
}
