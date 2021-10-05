package com.techelevator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class WordSearch {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		File inputFile = new File("alices_adventures_in_wonderland.txt");

		if (inputFile.exists()) {
			System.out.println("found the file");
		}

		System.out.println("Please enter the word you would like to search for: ");
		String userInput = input.nextLine();
		Boolean isCaseSensitive = false;
		System.out.println("Would you like to search for words by a specific casing?");
		String searchSensitivity = input.nextLine();
		if (searchSensitivity.equalsIgnoreCase("Yes") || searchSensitivity.equalsIgnoreCase("Y") || searchSensitivity.equalsIgnoreCase("True")){
			isCaseSensitive = true;

		} else {
				isCaseSensitive = false;
			}


		try (Scanner inputScanner = new Scanner(inputFile.getAbsoluteFile())) {
			int numOfLines = 0;
			Map<Integer, String> linesAndValues = new HashMap<>();
			while (inputScanner.hasNextLine()){
				String lineInput = inputScanner.nextLine();
				numOfLines++;
				String [] wordsOnLine = lineInput.split(" ");
				for (String word : wordsOnLine){
					if (word.equalsIgnoreCase(userInput)){
						linesAndValues.put(numOfLines, lineInput);
					}

				}
			}
		}
		catch (FileNotFoundException fnfEx){
			System.out.println("File cannot be found.");
		}


	}

}
