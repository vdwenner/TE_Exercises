package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



public class FindAndReplace {

    public static void main(String[] args) {

        try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("What is the search word?");
            String searchWord = userInput.nextLine();
            if ((searchWord == null) || (searchWord.isEmpty())) {
                System.out.println("The word to replace is empty");
                System.exit(0);
            }
            System.out.println("What is the replacement word?");
            String replacementWord = userInput.nextLine();
            if ((replacementWord == null) || (replacementWord.isEmpty())) {
                System.out.println("The replacement word is empty");
                System.exit(0);
            }
            File sourceFile;
            System.out.println("What is the source file?");
            String path = userInput.nextLine();
            // Validate the input file
            sourceFile = new File(path);
            if (!sourceFile.exists()) {
                System.out.println(path + " does not exist");
                System.exit(0);
            } else if (!sourceFile.isFile()) {
                System.out.println(path + " is not a file");
                System.exit(0);
            }
            File destinationFile;
            System.out.println("What is the destination file?");
            path = userInput.nextLine();
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
            try (Scanner sourceScanner = new Scanner(sourceFile.getAbsoluteFile());
                 PrintWriter destinationWriter = new PrintWriter(destinationFile.getAbsoluteFile())) {
                while (sourceScanner.hasNextLine()) {
                    String line = sourceScanner.nextLine();
                    destinationWriter.println(line.replaceAll(searchWord, replacementWord));
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}
