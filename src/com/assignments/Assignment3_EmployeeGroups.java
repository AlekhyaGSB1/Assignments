package com.assignments;

/**
 * @author Alekhya GSB
 * 
 * @param empNames -- is an array which stores Employee Names with String data type
 * @param empIds -- is an array which stores Employee IDs with integer data type
 * 
 */

public class Assignment3_EmployeeGroups {
	
	static String [] empNames1 = new String[3];
	static int[] empIds1 = new int[3];
	
	public static void main(String args[])
	{
		
		
		Assignement3_Employee obj = new Assignement3_Employee();
		empNames1[0] =  obj.empNames[0];
		empNames1[1] = obj.empNames[1];
		empNames1[2] = obj.empNames[2];
		
		empIds1[0]= obj.empIds[0];
		empIds1[1]=obj.empIds[1];
		empIds1[2]= obj.empIds[2];
		
		System.out.println("Employee Name:" + empNames1[0]  +","+"\t" + "Employee ID : " + empIds1[0]	);
		System.out.println("Employee Name:" + empNames1[1]  +"," +"\t"+ "Employee ID : " + empIds1[1]	);
		System.out.println("Employee Name:" + empNames1[2]  +"," +"\t"  + "Employee ID : " + empIds1[2]	);
		
		
	}

}
