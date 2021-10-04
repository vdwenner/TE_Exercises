package com.techelevator.scanner;

import com.techelevator.Dog;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DogGenerator {

    public static void main(String[] args) {

    makeDogs();

    }

    public static void makeDogs(){

        //Second Example of using the File Scanner pattern from the slide deck
        // *****************************************************************
        // *** USING A TEXT FILE AS A DATA SOURCE TO INSTANTIATE OBJECTS ***
        // *****************************************************************

        File inputFile = new File("dogsource.txt");

        if (inputFile.exists()) {
            System.out.println("found the file");
        }

        List<Dog> DogTreat = new ArrayList<>();

        try (Scanner inputScanner = new Scanner(inputFile.getAbsoluteFile())) {

            System.out.println("Creating Dogs");

            while (inputScanner.hasNextLine()) {
                String lineInput = inputScanner.nextLine();

                // Split each line of the CSV (Comma Separated values) file by a comma to get the
                //  data needed for a Dog(name, treat) instantiation
                String [] wordsOnLine = lineInput.split(",");

                // Use the first [0] string for the name and the second [1] for the treat
                //  Invoking the String.trim() method to remove any white space in the
                //  source file
                DogTreat.add(new Dog(wordsOnLine[0].trim(), wordsOnLine[1].trim()));
            }
        }
        // Used in the event that the file hard-coded above cannot be found
        catch (FileNotFoundException fnf){
            System.out.println("Unable to create dogs");
        }
        // Used when the source file has a malformed line preventing the array
        //  from having [0] and [1] indexed elements
        catch (ArrayIndexOutOfBoundsException aiob){
            System.out.println("There is a configuration problem in the source file");
        }

        for (Dog dog: DogTreat){
            System.out.println(dog.toString() + " treats.");
        }

    }

}
