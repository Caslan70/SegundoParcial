package co.edu.unilibre.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unilibre.rest.CountryDto.CountryDto;

@RestController
public class CountryController {

	@RequestMapping(value= "/country", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CountryDto> allCountry(){
		List<CountryDto> country = new ArrayList<>();
			
		CountryDto country1 = new CountryDto(1, "Polonia");
		CountryDto country2 = new CountryDto(2, "United States");
		CountryDto country3 = new CountryDto(3, "Germany");
		
		
		country.add(country1);
		country.add(country2);
		country.add(country3);
		
		
		return country;
	}
}
