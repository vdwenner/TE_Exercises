package com.techelevator;
import java.util.Scanner;
public class TempConvert {
	public static void main(String args[])
		{
			double celsius,fahrenheit;
			Scanner sc = new Scanner(System.in);
			System.out.println("Would you like to convert from F or C? ");
			String temperatureSelector = sc.nextLine();
			if (temperatureSelector.equalsIgnoreCase("f")) {
				// Reads temperature in fahrenheit
				System.out.println("Enter the temperature in fahrenheit: ");
				fahrenheit=sc.nextInt();
				// Fahrenheit to celsius conversion formula
				celsius=(fahrenheit - 32)*5/9;
				// Print the result
				System.out.println("Celsius = "+celsius);
			} else {
				// Reads temperature in celsius
				System.out.println("Enter the temperature in Celcius: ");
				double celcius = sc.nextInt();
				// celcius to fahrenheit conversion formula
				celsius = (celcius * 1.8) + 32;
				// Print the result
				System.out.println("Fahrenheit = " + celsius);
		}
	}
}