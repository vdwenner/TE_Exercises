package com.techelevator;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		//create scanner
		Scanner sc = new Scanner(System.in);

//Banner
		System.out.println("****************");
		System.out.println("Fibonacci Finder");
		System.out.println("****************");

//user input
		System.out.print("Enter whole number: ");
		int userInput = Integer.parseInt(sc.nextLine());

//if else to handle exceptions
		if (userInput <= 0) {
			System.out.println("0, 1");
		} else {
			System.out.print("0, 1, 1, ");
		}

//
		int f2 = 1;
		int fibonnacci = 1;

		for (int i = 1; i + f2 < userInput; ) {

			fibonnacci = i + f2;

			i = f2;

			f2 = fibonnacci;

			if (fibonnacci + i <= userInput) {
				System.out.print(fibonnacci + ", ");
			} else {
				System.out.print(fibonnacci);
			}
			if (userInput == i + f2) {
				System.out.print(fibonnacci + i);

			}

		}
	}
}
