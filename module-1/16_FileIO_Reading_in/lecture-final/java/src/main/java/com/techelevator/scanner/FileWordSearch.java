package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileWordSearch {

    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("src/main/resources/Turing.txt");

        if (inputFile.exists()) {
            System.out.println("found the file");
        }

        try (    Scanner inputScanner = new Scanner(inputFile.getAbsoluteFile())) {

            int linesWithHuman = 0;
            Map<Integer,String> humanLines = new HashMap<>();

            while (inputScanner.hasNextLine()) {
                String lineInput = inputScanner.nextLine();
                linesWithHuman++;
                String [] wordsOnLine = lineInput.split(" ");


                for (String word : wordsOnLine) {
                    if(word.equalsIgnoreCase("human")){
                        humanLines.put(linesWithHuman, word);
                    }
                }
            }

            System.out.println(humanLines.toString());

        }

    }




}
