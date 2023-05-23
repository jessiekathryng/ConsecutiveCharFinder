package com.bharath.javaprograms.strings;

import java.util.Scanner;

public class ConsecutiveCharFinder {

	public static void main(String[] args) {
		System.out.println("Enter a String");
//		we will create a scanner to point to System.in so we can receive user input; We are assigning it to a local variable named Scanner 
		Scanner scanner = new Scanner(System.in);
//			We will use .next() to find a return the next complete token from the scanner
			String input = scanner.next();
			boolean found = false;
//			We will loop through the string starting at index 0 and going to the end of the string
			for(int i=0; i<input.length()-1; i++) {
//				If we find consecutive characters then the found variable will change to true
				if(input.charAt(i)==input.charAt(i+1)) {
					found = true;
					break;
				}
			}
//			We will print out the state of the found variable
			System.out.println(found);

	}

}
