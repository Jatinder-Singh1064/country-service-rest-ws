package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import dao.CountryDAO;


/**
 * Session Bean implementation class CountryManager
 */
@Stateless(mappedName = "countrymanager")
@LocalBean
public class CountryManager {

	CountryDAO countryDAO = new CountryDAO();
	
	public int getPopulation() {
		return CountryDAO.POPULATION;
	}

}
