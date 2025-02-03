package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment5 {
	
	/**
	 * @author Alekhya GSB
	 * @param topPopulationCountryList -- specifies the Country which has highest population
	 * @param topTouristCountries -- specifies that which country attracts most tourists in the world
	 * @param largestCitiesOfUsa -- specifies largest cities of USA and their population
	 * @param sum -- specifies sum of third and fifth value in an array
	 * @param topGrossingMovie -- specifies top grossing movie of all time  
	 * {@code} -- LinkedHashMap is used so that it prints the insertion order 
	 */
	public static void main(String args[])
	{
		//Create a list of the top 5 most populated countries in the world and print 2 nd Country
		
		List<String> topPopulationCountryList = new ArrayList<String>();
		topPopulationCountryList.add("India");
		topPopulationCountryList.add("China");
		topPopulationCountryList.add("USA");
		topPopulationCountryList.add("Indonesia");
		topPopulationCountryList.add("Pakistan");
		
		System.out.println("2nd Highest populated country in the world is:"+topPopulationCountryList.get(1));
		
		//Create a set of the top 10 most visited tourist attractions in the world and print out its size.
		
		Set<String> topTouristCountries = new HashSet<String>();
		topTouristCountries.add("France");
		topTouristCountries.add("Mexico");
		topTouristCountries.add("Spain");
		topTouristCountries.add("Turkey");
		topTouristCountries.add("Italy");
		topTouristCountries.add("USA");
		topTouristCountries.add("Greece");
		topTouristCountries.add("Austria");
		topTouristCountries.add("Germany");
		topTouristCountries.add("UAE");
		
		System.out.println("Set size is :"+topTouristCountries.size());
		
		//Create a map of the 5 largest cities in the United States and their populations.
		
		Map<String,Integer> largestCitiesOfUsa = new LinkedHashMap<String,Integer>();
		largestCitiesOfUsa.put("New York", 8804190);
		largestCitiesOfUsa.put("Los Angeles", 3971883);
		largestCitiesOfUsa.put("Chicago", 2720546);
		largestCitiesOfUsa.put("Houston", 2296224);
		largestCitiesOfUsa.put("Phoenix", 1563025);
		
		System.out.println("Map of Largest cities of USA with their population:"+ largestCitiesOfUsa);
		
		//Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
		
		int[] array = {10,34,22,12,44,56,76,90,67,20};
		int sum =0;
		sum=array[2]+array[4];
		System.out.println("Sum of third and fifth value is : "+sum);
		
		/*
		 * Create a list of the top 5 highest-grossing movies of all time and print out
		 * the third movie on the list.
		 */
		
		List<String> topGrossingMovie = new ArrayList<String>();
		topGrossingMovie.add("Bahubali 2");
		topGrossingMovie.add("Pushpa 2");
		topGrossingMovie.add("RRR");
		topGrossingMovie.add("Kalki 2898 AD");
		topGrossingMovie.add("Salaar");
		
		System.out.println("Third top grossing movie of all time is :"+topGrossingMovie.get(2));
		
		
		
	}

}
