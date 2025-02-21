package com.assignments;

import java.util.Scanner;

public class Assignment11 {
	static double num = 0;
	double n = 0;
	static double value = 0;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		double num = sc.nextDouble();
		System.out.println("Enter the power value");
		double n = sc.nextDouble();
		value = num;

		Assignment11 obj = new Assignment11();
		double result = obj.calPower(num, n);

		System.out.println("OUTPUT is:" + result);
	}

	public double calPower(double num, double n) {
		for (int i = 1; i < n; i++) {
			if (n > 0) {
				num = value * num;
			}
		}
		for (double i = n; i <= 0; i++) {
			if (n < 0) {
				num = 1 / (value * num);
			}

		}
		return num;
	}
}