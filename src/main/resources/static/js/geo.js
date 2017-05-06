/**
 * Created by Ronnie on 5/5/2017.
 */
define(['jquery'], function ($) {
    'use strict';
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(handleGetCurrentPosition, onError);
    }
    function handleGetCurrentPosition(location) {
        $("#loc").val(location.coords.latitude+','+location.coords.longitude);
    }

    function onError() {
        console.log("Not supported by browser");
    }
});