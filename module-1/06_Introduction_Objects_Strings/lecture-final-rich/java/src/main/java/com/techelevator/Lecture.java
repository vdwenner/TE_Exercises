package com.techelevator;

import java.util.Locale;

public class Lecture {

	public static void main(String[] args) {

//		String hello1 = "";
//		String hello2 = "";

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */

		String greeting = "Hello World!";
		System.out.println("The greeting is: " + greeting);
		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		System.out.println("*** charAt() ***");

		String name = "Rich Seeds";

		char first = name.charAt(0);
		char last = name.charAt(name.length() - 1);

		System.out.println("** First and Last Characters");
		System.out.println(first);
		System.out.println(last);
		System.out.println("** STRINGS ARE IMMUTABLE **");
		System.out.println(name);

		System.out.println("*** contains() ***");

		if(name.contains("rich")){
			System.out.println("Name contains lowercase 'rich' " );
		}
		if(name.contains("Rich")){
			System.out.println("Name contains uppercase 'Rich' " );
		}



		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */

		boolean endInEeds = name.endsWith("eeds");

		if(endInEeds){
			System.out.println("Why yes, name ends in 'eeds'");
		}

		// name = "Rich Seeds";

		int firstIndexOfS = name.indexOf("S");
		System.out.println(firstIndexOfS);

		int lastIndexOfS = name.lastIndexOf("S");
		System.out.println(lastIndexOfS);

		//How do you solve regardless of case??
		System.out.println("Approach 1, assign the lower case version of the string be searched to a new variable");

		String lowerName = name.toLowerCase();

		 firstIndexOfS = lowerName.indexOf("s");
		System.out.println(firstIndexOfS);

		 lastIndexOfS = lowerName.lastIndexOf("s");
		System.out.println(lastIndexOfS);

		System.out.println("Approach 2, 'dot-chaining'");

		System.out.println( name.toLowerCase().indexOf("s") );
		System.out.println( name.toLowerCase().lastIndexOf("s") );

		System.out.println("** Even with dot chaining Strings are immutable");
		System.out.println(name);

		System.out.println("As long as the return type of a method has methods associated with it, we can dot-chain");
		System.out.println( name.toUpperCase().substring(0,4).indexOf("R"));

		System.out.println("* Alternatively *");

		String firstFourName = name.toUpperCase().substring(0,4);
		int indexOfR = firstFourName.indexOf("R");

		System.out.println(indexOfR);

		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

		char[] helloArray = new char[] { 'G', 'r', 'e', 'e', 't', 'i', 'n', 'g', 's' };
		String hello1 = new String(helloArray);
		String hello2 = new String(helloArray);

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " in hello1 is not equal to hello2's " + hello2);
		}

		String hello3 = hello1;

		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		System.out.println("Hello 1 and 3 hashs (the reference on the stack)");
		System.out.println(hello1.hashCode());
		System.out.println(hello3.hashCode());

		hello3 = "ARRRG"; // This is actually JUST like call hello3 = new String("ARRRG"); WHICH IS RE-ASSIGNMENT OF THE REFERENCE!
		System.out.println("By reassigning hello3, the reference (Hash) changed");
		System.out.println(hello3.hashCode());

		System.out.println("...and here are the new values on the heap");
		System.out.println(hello3);
		System.out.println(hello1);

		System.out.println("... let's set hello3 to have the SAME characters as hello 1");

		hello3 = "Greetings";

		System.out.println(hello1 + " is in " + hello1.hashCode());
		System.out.println(hello3 + " is in " + hello3.hashCode());

		System.out.println("This is the JVM saving space and reusing the hello1 storage for efficiency");


		System.out.println("** BUT WAIT! THERE'S MORE! - what about the .equals method????");
		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		//while it is hard to see the difference between == and .equals using variables due to JVM optimizations
		// we can use literals to demonstrate

		if("equality" == "equality"){
			System.out.println("The two literals are equal");
		}else {
			System.out.println("nope");
		}

		String equalHack = "equal";

		System.out.println("Let's look at the literal 'equality' compared to varible of 'equal' + the literal 'ity' ");

		if("equality" == equalHack + "ity"){
			System.out.println("THESE two literals are equal???");
		}else{
			System.out.println("NOPE! They are NOT EQUIVALENT ( == ) ");
		}

		System.out.println("HOWEVER!!");

		if("equality".equals(equalHack + "ity") ){
			System.out.println("They are DOT Equals !!! ALWAYS USE .equals when comparing strings");
		}else{
			System.out.println("NOPE! ");
		}

	}
}
