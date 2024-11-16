package com.projectexample.web.unitconvertor.services;

import org.springframework.stereotype.Service;

@Service
public class WeightService {
	
	public double convert(double value, String fromUnit, String toUnit) {
		double gramValue;
		switch (fromUnit) {
		    case "milligram":
		        gramValue = value / 1000;
		        break;
		    case "gram":
		        gramValue = value;
		        break;
		    case "kilogram":
		        gramValue = value * 1000;
		        break;
		    case "ounce":
		        gramValue = value * 28.3495;
		        break;
		    case "pound":
		        gramValue = value * 453.592;
		        break;
		    default:
		        gramValue = 0;
		        break;
		}

		double convertedValue;
		switch (toUnit) {
		    case "milligram":
		        convertedValue = gramValue * 1000;
		        break;
		    case "gram":
		        convertedValue = gramValue;
		        break;
		    case "kilogram":
		        convertedValue = gramValue / 1000;
		        break;
		    case "ounce":
		        convertedValue = gramValue / 28.3495;
		        break;
		    case "pound":
		        convertedValue = gramValue / 453.592;
		        break;
		    default:
		        convertedValue = 0;
		        break;
		}

		return convertedValue;

	}
}
