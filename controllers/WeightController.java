package com.projectexample.web.unitconvertor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.projectexample.web.unitconvertor.services.WeightService;

@Controller
public class WeightController {
	
	@Autowired
    private WeightService weightService;

    @GetMapping("/weight")
    public String weightForm() {
        return "weight";
    }

    @PostMapping("/weight")
    public String convertWeight(@RequestParam double value,
                                @RequestParam String fromUnit,
                                @RequestParam String toUnit,
                                Model model) {
        double result = weightService.convert(value, fromUnit, toUnit);
        model.addAttribute("result", result);
        model.addAttribute("fromUnit", fromUnit);
        model.addAttribute("toUnit", toUnit);
        model.addAttribute("value", value);
        return "weight";
    }

}
