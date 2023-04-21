/*
package com.sharma.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharma.api.controller.service.CountryClient;
import com.sharma.api.responce.model.Country;

@RestController
@RequestMapping("/countryresource")
public class CountryResourse {

	private final CountryClient countryClient;

	@Autowired
	public CountryResourse(CountryClient countryClient) {
		this.countryClient = countryClient;
	}

	//  Asynchronous Call
	 @GetMapping(value = "/async")
	  public List<String> getAllEuropeanFrenchSpeakingCountriesaSync() {
	  List<Country> countriesByLanguage =  countryClient.getCountriesByLanguageAsync("fr"); 
	  List<Country> countriesByRegion =  countryClient.getCountriesByRegionAsync("europe");	  
	  
	  List<String> europeanFrenchSpeakingCountries = new ArrayList<>(
	 						 countriesByLanguage.stream()
	 						.map(Country::getName)
	 						.collect(Collectors.toList()));
	 	System.out.println("European French Speaking Countries " +europeanFrenchSpeakingCountries); 
	 	europeanFrenchSpeakingCountries.retainAll(countriesByRegion.stream().map(Country::getName).collect(
	  										Collectors.toList()));
	  System.out.println("European French Speaking Countries after combination " +europeanFrenchSpeakingCountries); 
	  return europeanFrenchSpeakingCountries;
	  
	 }
	 
	 
	
	
	@GetMapping
	public List<String> getAllEuropeanFrenchSpeakingCountries() {
		CompletableFuture<List<Country>> countriesByLanguage = countryClient.getCountriesByLanguage("fr");
		CompletableFuture<List<Country>> countriesByRegion = countryClient.getCountriesByRegion("europe");
		
		List<String> europeanFrenchSpeakingCountries = new ArrayList<>();
		
		try {
			europeanFrenchSpeakingCountries = countriesByLanguage.get().stream()
				.map(Country::getName).collect(Collectors.toList());
			europeanFrenchSpeakingCountries.retainAll(
					countriesByRegion.get().stream().map(Country::getName).collect(Collectors.toList())
					);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return europeanFrenchSpeakingCountries;
	}
}
*/
