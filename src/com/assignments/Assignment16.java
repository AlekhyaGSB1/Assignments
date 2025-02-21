package com.assignments;

import java.util.Scanner;

public class Assignment16 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter no of rows to be printed");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int count=n;
			for(int j=i;j<n-1;j++)
			{
				System.out.print(" ");
				count--;
			}
			for(int k=0;k<count;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
