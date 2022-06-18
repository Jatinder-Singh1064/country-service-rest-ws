package service;

import java.util.List;
import dao.CountryDAO;
import model.Country;

public class CountryService {

	CountryDAO countryDAO = new CountryDAO();
	
	public Country createCountry(Country country) {
		Country countryResponse = countryDAO.createCountry(country);
		return countryResponse;
	}
	
	public Country getCountryById(String countryId) {
		Country countryResponse = countryDAO.getCountryById(countryId);
		return countryResponse;
	}
	
	public Country updateCountryName(String countryId, String countryName) {
		Country countryResponse = countryDAO.updateCountryName(countryId, countryName);
		return countryResponse;
	}
	
	public List<Country> getCountriesWithMoreThanFiveStates() {
		List<Country> countryList = countryDAO.getCountriesWithMoreThanFiveStates();
		return countryList;
	}

	public List<Country> getAllCountries() {
		List<Country> countryList = countryDAO.getAllCountries();
		return countryList;
	}

}
