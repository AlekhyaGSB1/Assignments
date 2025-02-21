package com.assignments;

import java.util.Arrays;

public class Assignment10 {

	public static void main(String args[]) {

		int array[] = { 7, 2, 5, 3, 6, 4 };
		// int temp=1;

		Assignment10 obj = new Assignment10();
		int result = obj.profit(array);
		System.out.println("OUTPUT is " + result);

	}

	public int profit(int[] array) {

		int minValueInArray = array[0];
		int maxValueInArray = array[0];
		int smallValueIndex = 0;
		int bigValueIndex = 0;
		int maxIndex = array.length - 1;
		int maxProfit = 0;
		for (int i = 0; i < array.length; i++) {
			if (minValueInArray > array[i]) {
				minValueInArray = array[i];
				smallValueIndex = i;
			}

		}
		for (int i = 0; i < array.length; i++) {
			if (maxValueInArray <= array[i]) {
				maxValueInArray = array[i];
				bigValueIndex = i;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (smallValueIndex < bigValueIndex) {
				maxProfit = maxValueInArray - minValueInArray;
			}

			else if (smallValueIndex == maxIndex) {
				maxProfit = 0;

			} else if (smallValueIndex > bigValueIndex) {
				Assignment10 obj = new Assignment10();
				int[] ascendingArray = obj.ascendingOrder(array);
				System.out.println(ascendingArray);
				
			}
		}
		System.out.println("MinValue" + minValueInArray);
		System.out.println("MaxValue" + maxValueInArray);

		return maxProfit;

	}

	public int[] ascendingOrder(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}

			}
		}
		System.out.println("Ascending array");

		return array;

	}

}
