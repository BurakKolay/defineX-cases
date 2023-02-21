package com.burakkolay.weatherapp.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;


@RestController
@RequestMapping("api/v1/weather")
public class WeatherController {

    private static final String apiEndPoint="https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/";
    private static final String apiKey="TNNAWEZLYCTK8VURRSLT22ANY";
    private static final String unitGroup="metric";
    private static final String location=null;
    private static final String startDate=null; //optional (omit for forecast)
    private static final String endDate=null; //optional (requires a startDate if present)
    private static final String contentType="json";

    RestTemplate restTemplate;

    public WeatherController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping(value = "/current")
    public String getCurrentTemp(@RequestParam String city){
        HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String >(httpHeaders);

        return restTemplate.exchange(apiEndPoint+city+"/today?unitGroup="+unitGroup+"&key="+apiKey+"&contentType="+contentType, HttpMethod.GET,entity,String.class).getBody();

    }

}
