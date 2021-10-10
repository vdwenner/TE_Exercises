package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {


        public static void main(String[] args) throws FileNotFoundException {

            try (Scanner userInput = new Scanner(System.in)) {
                File inputFile;
                while(true) {
                    System.out.println("What is the file that should be searched?");
                    String path = userInput.nextLine();
                    // Validate the input file
                    inputFile = new File(path);
                    if(!inputFile.exists()) {
                        System.out.println(path+" does not exist");
                        continue;
                    } else if(!inputFile.isFile()) {
                        System.out.println(path+" is not a file");
                        continue;
                    }
                    break;
                }
                int wordCount = 0;
                int sentenceCount = 0;
                try (Scanner inputScanner = new Scanner(inputFile.getAbsoluteFile())){
                    while (inputScanner.hasNextLine()) {
                        String line = inputScanner.nextLine();
                        if (!line.isEmpty()) {
                            String[] words = line.trim().split("\\s+");
                            wordCount += words.length;
                            for (String word : words) {
                                if (word.endsWith(".") || word.endsWith("?") || word.endsWith("!")) {
                                    sentenceCount += 1;
                                }
                            }
                        }
                        }
                    }
                System.out.println("Word count: " + wordCount);
                System.out.println("Sentence count: " + sentenceCount);
                }


            }

        }



