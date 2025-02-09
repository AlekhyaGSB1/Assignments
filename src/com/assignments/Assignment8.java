package com.assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment8 {
	public static void main(String args[])
	{
	
		String[] empName = {"Alice Johnson","Bob Smith","Carol Davis","David Brown","Eva Green"};
		
		Double[] empOneData = {75000.0,5.0,4.2};
		Double[] empTwoData = {68000.0,3.0,3.8};
		Double[] empThreeData = {82000.0,7.0,4.5};
		Double[] empFourData = {90000.0,10.0,2.0};
		Double[] empFiveData = {60000.0,2.0,3.5};
		
		Map<String,Double[]> employeeData = new HashMap<String, Double[]>();
		
		employeeData.put(empName[0], empOneData);
		employeeData.put(empName[1], empTwoData);
		employeeData.put(empName[2], empThreeData);
		employeeData.put(empName[3], empFourData);
		employeeData.put(empName[4], empFiveData);
		
		Map<String, Double> hikeMap = new HashMap<String,Double>();
		
		for(String emp : empName)
		{
            Double[] data = employeeData.get(emp); 
            
            double baseSalary = data[0];
            double experience = data[1];
            double rating = data[2];

            double variablePayPercentage = 0;
            double bonus = 0;
            double reward = 0;
			
			if(rating>=4)
			{
				variablePayPercentage=15;
				bonus=1500;
			}
			else if(rating>=3 && rating <4)
			{
				variablePayPercentage=10;
				bonus=1200;
			}
			else if(rating<3)
			{
				variablePayPercentage=3;
				bonus=300;
			}
			
			if(experience>=5)
			{
				reward=5000;
			}
			
			double hike = (baseSalary* variablePayPercentage ) + bonus+reward;
			double hikePercentage = hike/baseSalary;
			
			hikeMap.put(emp,hikePercentage);
			
		}
		
		System.out.println("Employee Hike Details:");
        System.out.println(hikeMap);
		
		
		
		
	}

}
