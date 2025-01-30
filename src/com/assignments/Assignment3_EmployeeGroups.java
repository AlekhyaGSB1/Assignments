package com.assignments;

public class Assignment3_EmployeeGroups {
	
	static String [] empNames = new String[3];
	static int[] empIds = new int[3];
	
	public static void main(String args[])
	{
		Assignement3_Employee obj = new Assignement3_Employee();
		empNames[0] =  obj.empNames[0];
		empNames[1] = obj.empNames[1];
		empNames[2] = obj.empNames[2];
		
		empIds[0]= obj.empIds[0];
		empIds[1]=obj.empIds[1];
		empIds[2]= obj.empIds[2];
		
		System.out.println("Employee Name:" + empNames[0]  +","+"\t" + "Employee ID : " + empIds[0]	);
		System.out.println("Employee Name:" + empNames[1]  +"," +"\t"+ "Employee ID : " + empIds[1]	);
		System.out.println("Employee Name:" + empNames[2]  +"," +"\t"  + "Employee ID : " + empIds[2]	);
		
		
	}

}
