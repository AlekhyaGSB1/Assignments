package com.assignments;

public class Assignment13 {
	public static void main(String args[])
	{
		int n=5;
		int count = n-1;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=0;j<count;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
				
				
			}
			count--;
			System.out.println("");
		}
		for(int i=n-1;i>=0;i--)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		
	}

}
