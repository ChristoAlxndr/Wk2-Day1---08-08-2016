package com.practiceandprojects;

public class ExceptionErrors {

	public static void main(String[] args) {
	
		int[] hiya = new int[1];
		
		try {
		System.out.println(hiya[2]);
		} catch (ArrayIndexOutOfBoundsException alienEggs) {
			
			System.out.println("You've made some error.");
		}
		
	}

}
