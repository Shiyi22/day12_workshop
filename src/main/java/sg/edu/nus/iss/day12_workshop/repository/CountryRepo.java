package sg.edu.nus.iss.day12_workshop.repository;

import java.util.ArrayList;
import java.util.List;

import sg.edu.nus.iss.day12_workshop.model.Country;

public class CountryRepo {

    List<Country> countryList; 

    public List<Country> getAllCountries() {
        
        countryList = new ArrayList<>(); 
        Country city = new Country("SG", "Singapore", 6000000);
        countryList.add(city);  
        city = new Country("MY", "Malaysia", 33000000);
        countryList.add(city);  
        city = new Country("CN", "China", 143000000);
        countryList.add(city);  
        city = new Country("HK", "Hong Kong", 7000000);
        countryList.add(city);  
        
        return countryList;
    }
    
    // function to add new country to the list -> info is parsed in 
    public Boolean createCountry(Country city) {

        if (countryList == null) {
            countryList = new ArrayList<>(); 
        }
        countryList.add(city); 
        return true; 
    }
}
