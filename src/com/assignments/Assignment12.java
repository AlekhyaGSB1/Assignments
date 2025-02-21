package com.assignments;

import java.util.Scanner;

public class Assignment12 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int result =Assignment12.isPrimeNum(num);
		if(result==2)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
	}
		
		public static int isPrimeNum(int num)
		{
			int count=0;
			for(int i=1;i<=num;i++)
			{
				if(num>1 && num%i==0 )
				{
				   count++;
				}
				
			}
			return count;
		}
}

		
	


