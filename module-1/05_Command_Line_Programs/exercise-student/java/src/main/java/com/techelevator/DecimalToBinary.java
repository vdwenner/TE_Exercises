package com.techelevator;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal number that you want converted to Binary: ");
		int decimal = sc.nextInt();
		System.out.println(Integer.toBinaryString(decimal));

	}

}
