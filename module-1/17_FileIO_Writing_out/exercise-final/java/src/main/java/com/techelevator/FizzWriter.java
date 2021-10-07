package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {

		// Ask the user for a destination file
		File destinationFile;

		try (Scanner userInput = new Scanner(System.in)) {
			System.out.println("What is the destination file?");
			String path = userInput.nextLine();
			destinationFile = new File(path);
			// Validate the destination file
			if(path == null || path.isEmpty()) {
				System.out.println("The destination filename is empty");
				System.exit(0);
			}
			if(!destinationFile.getName().endsWith(".txt")) {
				System.out.println("The destination file must end in .txt");
				System.exit(0);
			}
		}

		// Write FizzBuzz 1 - 300
		try (PrintWriter destinationWriter = new PrintWriter(destinationFile.getAbsoluteFile())) {
			for (int i = 1; i <= 300; i++) {
				boolean isDivisibleBy5 = i % 5 == 0;
				boolean isDivisibleBy3 = i % 3 == 0;
				if (isDivisibleBy5 && isDivisibleBy3) {
					destinationWriter.println("FizzBuzz");
				} else if (isDivisibleBy3) {
					destinationWriter.println("Fizz");
				} else if (isDivisibleBy5) {
					destinationWriter.println("Buzz");
				} else {
					destinationWriter.println(i);
				}
			}

			System.out.println(destinationFile + " has been created.");

		} catch (FileNotFoundException fileNotFoundException) {
			System.out.print(fileNotFoundException.getMessage());
		}
	}

}
