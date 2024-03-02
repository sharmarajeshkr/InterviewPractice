package com.sharma.api.controller.service;

import com.sharma.api.responce.model.Country;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class CountryClient {

    RestTemplate restTemplate = new RestTemplate();


    public List<Country> getCountriesByLanguageAsync(String language) {
        String url = "https://restcountries.eu/rest/v2/lang/" + language + "?fields=name";
        Country[] response = restTemplate.getForObject(url, Country[].class);

        return Arrays.asList(response);
    }


    public List<Country> getCountriesByRegionAsync(String region) {
        String url = "https://restcountries.eu/rest/v2/region/" + region + "?fields=name";
        Country[] response = restTemplate.getForObject(url, Country[].class);

        return Arrays.asList(response);
    }


    @Async
    // CompletableFuture<List<Country>>
    public CompletableFuture<List<Country>> getCountriesByLanguage(String language) {
        String url = "https://restcountries.eu/rest/v2/lang/" + language + "?fields=name";
        Country[] response = restTemplate.getForObject(url, Country[].class);
        // return CompletableFuture;
        return CompletableFuture.completedFuture(Arrays.asList(response));
    }

    @Async
    public CompletableFuture<List<Country>> getCountriesByRegion(String region) {
        String url = "https://restcountries.eu/rest/v2/region/" + region + "?fields=name";
        Country[] response = restTemplate.getForObject(url, Country[].class);

        // return Arrays.asList(response);
        return CompletableFuture.completedFuture(Arrays.asList(response));
    }


}
