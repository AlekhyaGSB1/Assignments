package com.assignments;

public class Assignment6 {
	public static void main(String args[])
	{
		int creditScore = 680;
		String customerName = "John Deo";
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRation = 35.0;
		
		if(creditScore>750)
		{
			System.out.println("Loan is approved automatically for "+customerName);
		}
		else if(creditScore>=650 && creditScore<=750)
		{
			if(income<50000.0)
			{
				System.out.println("Loan is denied for "+customerName);
			}
			else if(income>=50000.0)
			{
				if(isEmployed==false)
				{
					System.out.println("Loan is denied for "+customerName);
				}
				else if(isEmployed==true)
				{
					if(debtToIncomeRation>40)
					{
						System.out.println("Loan is denied for "+customerName);
					}
					else if(debtToIncomeRation<40)
					{
						System.out.println("Loan is approved for "+customerName);
					}
				}
			}
		}
		else if(creditScore<650)
		{
			System.out.println("Loan is automatically denied for "+customerName);
		}
	}

}
