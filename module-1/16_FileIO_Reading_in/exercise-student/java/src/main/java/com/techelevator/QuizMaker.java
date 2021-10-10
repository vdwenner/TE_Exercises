package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class QuizMaker {

	public static void main(String[] args) throws FileNotFoundException {

		try (Scanner userInput = new Scanner (System.in)) {
			File inputFile;
			while(true) {
				System.out.println("where is the quiz file?");
				String path = userInput.nextLine();
				inputFile = new File(path);
				if(!inputFile.exists()) {
					System.out.println(path + " does not exist");
					continue;
				} else if (!inputFile.isFile()) {
					System.out.println(path + " is not a file");
					continue;
				}
				break;
			}
			List<QuizQuestion> quizQuestions = new ArrayList<QuizQuestion>();
			try(Scanner fileScanner = new Scanner (inputFile)) {
				while (fileScanner.hasNextLine()) {
					String line = fileScanner.nextLine();
					quizQuestions.add(new QuizQuestion(line));
				}
			}
			int numberOfQuestions = 0;
			int numberOfCorrectAnswers = 0;
			for (QuizQuestion quizQuestion : quizQuestions) {
				while (true) {
					System.out.println("\n" + quizQuestion.getQuestion());
					for (int i = 0; i < quizQuestion.getAnswers().length; i++) {
						System.out.println((i + 1) + ") " + quizQuestion.getAnswers()[i]);
					}
					System.out.println("\nYour answer?");
					String userAnswer = userInput.nextLine();
					if ((!userAnswer.isEmpty()) && userAnswer.matches("[1-4]")) {
						if (quizQuestion.isCorrectAnswer(userAnswer)) {
							System.out.println("Correct!");
							numberOfCorrectAnswers += 1;
						}
						else {
							System.out.println("Sorry that isn't correct!");
						}
						break;
					}
					System.out.println("Invalid answer!");
				}
				numberOfQuestions += 1;
			}
			System.out.println("You got " + numberOfCorrectAnswers + " answers correct out of the total " + numberOfQuestions + " questions asked.");
		}

	}

}
