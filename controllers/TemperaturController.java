package com.projectexample.web.unitconvertor.controllers;

import com.projectexample.web.unitconvertor.services.TemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TemperaturController {
	
	@Autowired
    private TemperatureService temperatureService;

    @GetMapping("/temperature")
    public String temperatureForm() {
        return "temperature";
    }

    @PostMapping("/temperature")
    public String convertTemperature(@RequestParam double value,
                                     @RequestParam String fromUnit,
                                     @RequestParam String toUnit,
                                     Model model) {
        double result = temperatureService.convert(value, fromUnit, toUnit);
        model.addAttribute("result", result);
        model.addAttribute("fromUnit", fromUnit);
        model.addAttribute("toUnit", toUnit);
        model.addAttribute("value", value);
        return "temperature";
    }

}
