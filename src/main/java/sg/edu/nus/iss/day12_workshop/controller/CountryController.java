package sg.edu.nus.iss.day12_workshop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sg.edu.nus.iss.day12_workshop.model.Country;
import sg.edu.nus.iss.day12_workshop.service.CountryService;

@Controller
@RequestMapping("/countries")
public class CountryController {
    
    CountryService ctySvc; 

    // constructor instantiation since we did not annotate @service
    public CountryController() {
        ctySvc = new CountryService(); 
    }

    // get mapping to get the list of countries in xml format
    @GetMapping(produces="application/xml")
    public @ResponseBody List<Country> getAllCountries() {
        return ctySvc.getAllCountries(); 
    }
    
    // post mapping to add country to list 
    @PostMapping
    public @ResponseBody Boolean createCountry(Country city) {
        return ctySvc.createCountry(city); 
    }

    // get mapping to display the list of countries 
    @RequestMapping(path="/list", method=RequestMethod.GET)
    public String displayCountryList(Model model) {
        List<Country> ctyList = ctySvc.getAllCountries(); 
        model.addAttribute("ctyList", ctyList);
        return "countryList"; 
    }

}
