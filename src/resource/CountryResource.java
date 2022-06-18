package resource;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import ejb.CountryManager;
import model.Country;
import service.CountryService;

@Path("/CountryService")
@ApplicationPath("/resources")
public class CountryResource extends Application {
	
	//http://localhost:8080/Jatinder_MidTermPartB/resources/CountryService/population
	
	@EJB
	CountryManager countryManager;
	
	CountryService countryService = new CountryService();
	
	@GET
	@Path("/population")
	@Produces(MediaType.TEXT_HTML)
	public String getPopulation() {
		return "<h1>Total Population is : " + countryManager.getPopulation() + "</h1>";
	}
	
	@GET
	@Path("/country/{countryId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Country getCountryById(@PathParam("countryId") String id) {
		Country countryRes = countryService.getCountryById(id);
		return countryRes;
	}
	
	@POST
	@Path("/addcountry")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Country addCountry(Country country) {
		Country countryRes = countryService.createCountry(country);
		return countryRes;
	}
	
	@PUT
	@Path("/updatename/{countryId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Country updateCountryName(@PathParam("countryId") String id, @QueryParam("name") String countryName) {
		Country countryRes =  countryService.updateCountryName(id, countryName);
		return countryRes;
	}	
	
	@GET
	@Path("/countries")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Country> getCountriesWithMoreThanFiveStates(){
		List<Country> countryList = countryService.getCountriesWithMoreThanFiveStates();
		return countryList;
	}
	
	@GET
	@Path("/allcountries")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Country> getAllCountries(){
		List<Country> countryList = countryService.getAllCountries();
		return countryList;
	}

}
