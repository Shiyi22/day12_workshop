package sg.edu.nus.iss.day12_workshop.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/workshop")
public class WorkShopController {
    
    @GetMapping
    public String workshop() {

        return "workshop";
    }

    @PostMapping("/processNumber")
    public String processNumber(@RequestParam(name="inputNumber", defaultValue="1") Integer unit, Model model) {

        List<Integer> listIntegers = new ArrayList<>(); // to save the number variable that we want to generate randomly 
        Integer loopValue = unit; // how many numbers we want to generate 
        Integer currentValue = 1; 

        while(currentValue <= loopValue) {
            Integer result = (int) ((Math.random() * loopValue) + 1); 

            // to get non-duplicate results
            if (!listIntegers.contains(result)) {
                listIntegers.add(result); 
                currentValue++; 
            }
        }
        model.addAttribute("numbers", listIntegers);
        return "workshopresult"; 
    }
}
