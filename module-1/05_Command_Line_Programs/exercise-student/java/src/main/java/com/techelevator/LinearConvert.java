package com.techelevator;
import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		double feet, meters;
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to convert from F or M? ");
		String temperatureSelector = sc.nextLine();
		if (temperatureSelector.equalsIgnoreCase("f")) {
			// Reads distance in feet
			System.out.println("Enter the distance in feet: ");
			feet=sc.nextInt();
			// Feet to meters conversion formula
			meters = feet * 0.3048;
			// Print the result
			System.out.println("Meters = "+ meters);
		} else {
			// Reads distance in meters
			System.out.println("Enter the distance in Meters: ");
			meters = sc.nextInt();
			// feet to meters conversion formula
			feet = meters * 3.2808399;
			// Print the result
			System.out.println("Feet = " + feet);
		}

	}

}
