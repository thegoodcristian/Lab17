package com.lab17;

import java.util.Scanner;

public class PrimeFinderMain extends PrimeFinder{

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);

		
		int userSequenceNum = Validator.getInt(scnr, "Please enter the sequence number of the prime you'd like to find: ");
		
		System.out.println(PrimeFinder.findPrime(userSequenceNum));
		
		System.out.println("The value of the prime at sequence number " + userSequenceNum + " is " + valueAtSequenceNum + ".");
		
	}
	
	
}
