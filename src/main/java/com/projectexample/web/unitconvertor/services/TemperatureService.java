package com.projectexample.web.unitconvertor.services;

import org.springframework.stereotype.Service;

@Service
public class TemperatureService {
	
	public double convert(double value, String fromUnit, String toUnit) {
		// Convert from 'fromUnit' to Celsius
        double celsiusValue;
        switch (fromUnit) {
            case "Celsius" :
            	celsiusValue = value;
            	break;
            case "Fahrenheit" :
            	celsiusValue = (value - 32) * 5 / 9;
            	break;
            case "Kelvin" :
            	celsiusValue = value - 273.15;
            	break;
            default :
            	celsiusValue = 0;
            	break;
        }

        // Convert from Celsius to 'toUnit'
        double convertedValue;
        
        switch (toUnit) {
            case "Celsius" :
            	convertedValue = celsiusValue;
            	break;
            case "Fahrenheit" :
            	convertedValue = celsiusValue * 9 / 5 + 32;
            	break;
            case "Kelvin" :
            	convertedValue = celsiusValue + 273.15;
            	break;
            default :
            	convertedValue = 0;
            	break;
        }
        return convertedValue;
	}

}
