package com.Weather_App.Project_5_Wtherapp.weathercontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {

	@Value("${openweathermap.api.key}")
	private String openWeatherMapApiKey;
	
	private static final String OPENWEATHERMAP_API_URL="https://api.openweathermap.org/data/2.5/weather?q={city}&appid={apiKey}";

	private final RestTemplate restTemplate;
	
	public WeatherController(RestTemplate restTemplate)
	{
		this.restTemplate=restTemplate;
		}
	
	@GetMapping("/weather")
	public String getWeather(@RequestParam String city) {
	    String url = OPENWEATHERMAP_API_URL.replace("{city}", city).replace("{apiKey}", openWeatherMapApiKey);
	    return restTemplate.getForObject(url, String.class);
	}

	
}