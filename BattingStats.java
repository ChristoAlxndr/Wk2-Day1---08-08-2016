package com.practiceandprojects;

import java.util.ArrayList;
import java.util.Scanner;

public class BattingStats {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean enterStats = true;
		
		
		System.out.println("Welcome to the Batting Average and "
				+ "Slugging Percentage Calculator. \n" +
				"Please press <ENTER> to begin.");
				String beginCalculator = sc.nextLine();
		System.out.println("\n");
		
		System.out.println("Please enter batter's name.");
		String batterName = sc.nextLine();
		System.out.println("\n");
		
		System.out.println("How many at-bats for " + batterName);
		int atBats = sc.nextInt();
		int userInput = 0;
		ArrayList <Integer> atBatAL = new ArrayList <> (atBats);
		
		
		System.out.println(batterName + " was at-bat " + atBats + " times. \n\n" +
		 "Please enter the number of hits for " + batterName + " each time at bat. \n"
		 		+ "Enter 0 for out before on base \n"
		 		+ "Enter 1 for hit + 1st Base \n"
		 		+ "Enter 2 for hit + 2nd Base \n"
		 		+ "Enter 3 for hit + 3rd Base \n"
		 		+ "Enter 4 for hit + Home Run \n");
		
		
		for (int i = 1; i <= atBats; i++)
		{
			int hitStats = sc.nextInt();
			atBatAL.add(hitStats);
			System.out.println(atBatAL);
			System.out.println("Enter stats to continue.");
		}
		
		for (int i = 0; i < atBatAL.size(); i++)
		{
			if (atBatAL.get(i) == 0)
				atBatAL.remove(0);
		}
				
		float battingAvg = (atBatAL.size() / atBats); 
		
		System.out.println("\n\n" + batterName + "'s batting average "
				+ battingAvg + " ");
	
	System.out.println(atBatAL.size());
	
	}
}