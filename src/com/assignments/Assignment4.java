package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Alekhya GSB
 * @code Linked Hashmap is used since it saves the data in insertion order
 * @code ArrayList collection is used because we can access the data with index value
 * 
 */

/*************** Collections Assignment *************************/

public class Assignment4 {
	
	public static void main(String args[])
	{
		// Below code is to save employee1 data in a Map with key and values
		Map<String,String> emp1 = new LinkedHashMap<String, String>();
		emp1.put("Employee ID", "E001");
		emp1.put("Name", "Alice Green");
		emp1.put("Age", "30");
		emp1.put("Gender", "Female");
		emp1.put("Department", "Engineering");
		emp1.put("Position", "Software Engineer");
		emp1.put("Salary", "75,000");
		emp1.put("Email", "alice@example.com");
		emp1.put("Contact Number", "9876543213");
		
		// Below code is to save employee2 data in a Map with key and values
		Map<String,String> emp2 = new LinkedHashMap<String, String>();
		emp2.put("Employee ID", "E002");
		emp2.put("Name", "Bob johnson");
		emp2.put("Age", "35");
		emp2.put("Gender", "Male");
		emp2.put("Department", "Marketing");
		emp2.put("Position", "Marketing Manager");
		emp2.put("Salary", "85,000");
		emp2.put("Email", "bob@example.com");
		emp2.put("Contact Number", "9876543214");
		
		// Below code is to save employee3 data in a Map with key and values
		Map<String,String> emp3 = new LinkedHashMap<String, String>();
		emp3.put("Employee ID", "E003");
		emp3.put("Name", "Carol White");
		emp3.put("Age", "28");
		emp3.put("Gender", "Female");
		emp3.put("Department", "Sales");
		emp3.put("Position", "Sales Executive");
		emp3.put("Salary", "65,000");
		emp3.put("Email", "carol@example.com");
		emp3.put("Contact Number", "9876543215");
		
		System.out.println(emp2.get("Email"));
		
		List<Map<String,String>> empData = new ArrayList<Map<String,String>>();
		empData.add(emp1);
		empData.add(emp2);
		empData.add(emp3);
		
		System.out.println(empData.get(1).get("Email"));
		
				
	}

}
