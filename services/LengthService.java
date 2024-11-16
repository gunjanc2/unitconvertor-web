package com.projectexample.web.unitconvertor.services;

import org.springframework.stereotype.Service;

@Service
public class LengthService {

	public double convert(double value, String fromUnit, String toUnit) {
		// Conversion factors to meters
		double meterValue;

		switch (fromUnit) {
		case "millimeter": 
			meterValue = value / 1000;
			break;
		case "centimeter": 
			meterValue = value / 100;
			break;
		case "meter" : 
			meterValue = value;
			break;
		case "kilometer" : 
			meterValue = value * 1000;
			break;
		case "inch" : 
			meterValue = value * 0.0254;
			break;
		case "foot" : 
			meterValue = value * 0.3048;
			break;
		case "yard" : 
			meterValue = value * 0.9144;
			break;
		case "mile" : 
			meterValue = value * 1609.34;
			break;
		default : 
			meterValue = 0;
			break;
		}

		double convertedValue;
		switch(toUnit) {
		case "millimeter" : 
			convertedValue = meterValue * 1000;
			break;
		case "centimeter":  
			convertedValue = meterValue * 100;
			break;
		case "meter":
			convertedValue = meterValue;
			break;
		case "kilometer":
			convertedValue = meterValue / 1000;
			break;
		case "inch":
			convertedValue = meterValue / 0.0254;
			break;
		case "foot":
			convertedValue = meterValue / 0.3048;
			break;
		case "yard":
			convertedValue = meterValue / 0.9144;
			break;
		case "mile":
			convertedValue = meterValue / 1609.34;
			break;
		default:
			convertedValue = 0;
			break;

		}
		return convertedValue;
	}
}
