package com.baibhav.chciago.CountCharacters;

import java.util.Arrays;

//Supplied will be the string and you have to count all the frequecny of the charcaters in the string.String may 
//have spaces 
public class CountCharacters {

	public static void main(String[] args) {
		
		String str= "My name is   baibhav ghimire and i live in the city called schaumburg which is the northwest chicago burb";
		getString(str);
		

	}

	public static void getString(String str) {
		
		int [] count = new int[256];
		char[] c = str.toCharArray();
		
		for(char i :c){
			count[i]++;
			
		} 
			System.out.println("The ascii values are " +Arrays.toString(count));	
			
			for (int i = 0; i < count.length; i++) {
			    if (count[i] > 0)
			       System.out.println("Number of charcaters " + (char) i + ": " + count[i]);
			}
		
		
	}

}
