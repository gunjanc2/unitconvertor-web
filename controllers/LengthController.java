package com.projectexample.web.unitconvertor.controllers;

import com.projectexample.web.unitconvertor.services.LengthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LengthController {
	
	@Autowired
    private LengthService lengthService;
	
	@GetMapping("/length")
    public String lengthForm() {
        return "length";
    }
	
	@PostMapping("/length")
    public String convertLength(@RequestParam double value,
                                @RequestParam String fromUnit,
                                @RequestParam String toUnit,
                                Model model) {
        double result = lengthService.convert(value, fromUnit, toUnit);
        model.addAttribute("result", result);
        model.addAttribute("fromUnit", fromUnit);
        model.addAttribute("toUnit", toUnit);
        model.addAttribute("value", value);
        return "length";
    }

}
