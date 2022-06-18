package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import model.Country;

public class CountryDAO {

	static HashMap<String, Country> countryMap = new HashMap<String, Country>();
	public static final int POPULATION = 2500;
	
	public CountryDAO() {
		Country country1 = new Country();
		country1.setId("1");
		country1.setName("India");
		List<String> country1StatesList = new ArrayList<String>();
		country1StatesList.add("Punjab");
		country1StatesList.add("Haryana");
		country1StatesList.add("Gujarat");
		country1StatesList.add("Kerala");
		country1StatesList.add("Tamil Nadu");
		country1StatesList.add("Bihar");
		country1.setStates(country1StatesList);
		country1.setCity("Delhi");
		
		Country country2 = new Country();
		country2.setId("2");
		country2.setName("Canada");
		List<String> country2StatesList = new ArrayList<String>();
		country2StatesList.add("Ontario");
		country2StatesList.add("Alberta");
		country2StatesList.add("Ottawa");
		country2StatesList.add("Nova Scotia");
		country2StatesList.add("Quebec");
		country2StatesList.add("Manitoba");
		country2StatesList.add("British Columbia");
		country2.setStates(country2StatesList);
		country2.setCity("Toronto");
		
		countryMap.put("1", country1);
		countryMap.put("2", country2);
	}

	public Country createCountry(Country country) {
		countryMap.put(country.getId(), country);
		return countryMap.get(country.getId());
	}

	public Country updateCountryName(String countryId, String countryName) {
		if(countryId.isEmpty() || countryName.isEmpty()) {
			System.out.println("country id or country name passed is null");
			return null;
		}
		Country country = countryMap.get(countryId);
		if(country == null) {
			System.out.println("No country exists with this country id");
			return null;
		}
		country.setName(countryName);
		countryMap.put(country.getId(), country);
		return countryMap.get(country.getId());
	}

	public List<Country> getCountriesWithMoreThanFiveStates() {
		List<Country> countryList = new ArrayList<Country>(countryMap.values());
		List<Country> countriesWithMoreThanFiveStatesList = new ArrayList<Country>();
		for(Country c : countryList) {
			List<String> states = c.getStates();
			if(states.size() > 5) {
				countriesWithMoreThanFiveStatesList.add(c);
			}
		}	
		return countriesWithMoreThanFiveStatesList;
	}

	public Country getCountryById(String countryId) {
		if(countryId.isEmpty()) {
			System.out.println("country id passed is null");
			return null;
		}
		return countryMap.get(countryId);
	}

	public List<Country> getAllCountries() {
		List<Country> countryList = new ArrayList<Country>(countryMap.values());
		return countryList;
	}
}
