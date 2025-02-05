package com.assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment7 {
	
	public static void main(String args[])
	{
		List<Integer> transactions = new ArrayList<Integer>();
		transactions.add(50000);
		transactions.add(-2000);
		transactions.add(3000);
		transactions.add(-15000);
		transactions.add(-200);
		transactions.add(-300);
		transactions.add(4000);
		transactions.add(-3000);
		
		//1. Print total number of credit and debit transactions completed
		
		System.out.println("Total number of credit and debit transactions are : \t"+transactions.size());
		
		//2. Print the total amount credited and debited in account
		
		int creditedAmount =0;
		int debitedAmount =0;
		
		for(int i=0;i<transactions.size();i++)
		{
			
			
			if(transactions.get(i)>0)
			{
				creditedAmount = creditedAmount+transactions.get(i);
			}
			else
			{
				debitedAmount = debitedAmount+transactions.get(i);
			}
		}
		System.out.println("Total credited Amount is \t"+ creditedAmount);
		System.out.println("Total debited Amount is \t"+debitedAmount);
		
		//3. Print total amount remaining at the end in Bank Account
		
		
		int totalAmountRemaining =0;
		for(int i=0;i<transactions.size();i++)
		{
			totalAmountRemaining = totalAmountRemaining+transactions.get(i);
		}
		System.out.println("Total Amount remaining in the bank is :\t"+totalAmountRemaining);
		
		/*
		 * 4. If any transaction limit exceeds +/- 10000 then print the message
		 * “Suspicious credit/ debit Transaction with Amount” and also print total
		 * number of suspicious transactions
		 */
		
		int suspeciousTransactionsCount = 0;
		for(int i=0;i<transactions.size();i++)
		{
			
				if(transactions.get(i)>=10000 || transactions.get(i)<= -10000)
				{
					System.out.println("Suspecious credit/debit amount is \t"+transactions.get(i));
					++suspeciousTransactionsCount;
				}
				
				else 
				{
					continue;
				}
			
			
		}
		System.out.println("Total number of suspecious credit and debit is \t"+suspeciousTransactionsCount);
	}
	

}
