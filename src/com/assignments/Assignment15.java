package com.assignments;

public class Assignment15 {
	public static void main(String args[]) {
		String sentence = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";

		/*
		 * 1. Divide into multiple words 2. Find total number of occurrences 3. Print
		 * count and Indexes of the word
		 */

		String[] array = sentence.split(" ");
		int count = 0;
		String expString = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("Java")) {
				count++;
				expString = array[i];

				for (int j = 0; j <expString.length() ; j++) {
					
					int index = sentence.indexOf(expString);
					System.out.println("Index of word Java is" + index);
				}

			}

		}

		System.out.println("No of occurences of word JAVA is" + count);

	}
}
