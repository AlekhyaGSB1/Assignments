package com.assignments;

import java.util.Arrays;

public class Assignment14 {
	public static void main(String args[]) {
		String sentence = "Java programming is fun and challenging";
         
		/*
		 * 1. Count the total number of words in the sentence.
		 * 2. Print the sentence words in reverse order. 
		 * 3. Convert the first character of each word to uppercase and print original sentence
		 */

		int count = 0;
		String array[] = sentence.split(" ");
		char revChar;
		String revArray = "";
		String upperCaseString="";
		String upperCaseString1 = "";
		for (int i = 0; i < array.length; i++) {
			count++;
			
            
			for (int j = array[i].length() - 1; j >= 0; j--) {

				revChar = array[i].charAt(j);
				revArray = revArray + revChar;

			}
			revArray = revArray + " ";
			
			for(int j=0;j<array[i].length();j++)
			{
				String firstLetter = array[i].substring(j, j+1).toUpperCase();
				 upperCaseString = firstLetter+array[i].substring(j+1);
				break;
			  
			}
			upperCaseString1 = upperCaseString1+upperCaseString;
		}
		
		System.out.println("Number of words in the sentence is" + count);
		System.out.println("Sentence word in reverse order::::: "+revArray);
		System.out.println("UPPER CASE::::"+upperCaseString1);
		

	}

}
