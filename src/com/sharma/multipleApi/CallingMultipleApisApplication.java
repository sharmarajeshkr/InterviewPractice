/*
package com.sharma.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

*/
/*
 1 . Add @Async annotation to the function you want to parallelize getCountriesByLanguage and getCountriesByRegion
 2 . Change the return type of the function by CompletableFuture<List<Country>>
 3 . Change the return of getCountriesByLanguage and getCountriesByRegion by CompletableFuture.completedFuture(Arrays.asList(response))
 4 . Change the type of what return getCountriesByLanguage and Region by CompletableFuture<List<Country>>
 5 . Add a try-catch when you use the completableFuture in your resource
 6 . Add a .get() in order to use the elements of the list of countries
 7 . Add throws Throwable to the function getAllEuropeanFrenchSpeakingCountries
 8 . Add an AsyncConfiguration
*//*




@SpringBootApplication
public class CallingMultipleApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallingMultipleApisApplication.class, args);
	}

}
*/
