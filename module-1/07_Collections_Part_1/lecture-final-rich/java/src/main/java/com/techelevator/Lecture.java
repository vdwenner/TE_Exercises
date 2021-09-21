package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		System.out.println();

		List<String> names = new ArrayList<>();
		names.add("Bob");
		names.add("Mary");
		names.add("Kory");

		System.out.println();
		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");
		System.out.println();

		System.out.println("Names list has: " + names.size() + " names in it");
		System.out.println("First Name is: " + names.get(0));
		System.out.println("Last Name is: " + names.get(names.size() - 1));

		System.out.println();
		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
		System.out.println();

		names.add("Bob");
		System.out.println("Last Name is now: " + names.get(names.size() - 1));
		//Using what we learned in For Loops
		for( int i = 0; i < names.size(); i++){
			System.out.println("Names List now contains 2 Bobs, element[" + i + "] is: " + names.get(i));
		}

		System.out.println();
		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");
		System.out.println();

		names.add(2,"Mike");

		//Using what we learned in For Loops
		for( int i = 0; i < names.size(); i++){
			System.out.println("Names List, names[" + i + "] is: " + names.get(i));
		}

		System.out.println();
		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
		System.out.println();

		if(names.contains("Bob")){
			System.out.println("Bob is in the list!");
		}else{
			System.out.println("Bob is not in the list");
		}


		System.out.println();
		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");
		System.out.println();

		names.remove(2);

		//Using what we learned in For Loops
		for( int i = 0; i < names.size(); i++){
			System.out.println("Names List, names[" + i + "] is: " + names.get(i));
		}

		System.out.println();
		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");
		System.out.println();

		int maryIdx = names.indexOf("Mary");
		int lastMaryIdx = names.lastIndexOf("Mary");

		System.out.println("Index Of Mary: " + maryIdx);
		System.out.println("Last Index Of Mary: " + maryIdx);

		for(int i = 0; i < names.size(); i++){
			if(names.get(i).equals("Bob")){
				System.out.println("There is a 'Bob'at names[" + i + "]");
			}
		}

		//What is the Object does not exist in list?

		System.out.println("Index Of Steve: " + names.indexOf("Steve"));
		System.out.println("Last Index Of Steve: " + names.lastIndexOf("Steve"));

		System.out.println();
		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");
		System.out.println();

		String[] namesStringArray = names.toArray(new String[0]);
		System.out.println("The names list converted to an array, String[], has length = " + namesStringArray.length);

		System.out.println();
		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");
		System.out.println();

		for( int i = 0; i < names.size(); i++){
			System.out.println("Names List, names[" + i + "] is: " + names.get(i));
		}

		System.out.println();
		System.out.println("SORT names");

		Collections.sort(names);
		// Not only does the  Collections class provide methods to sort, the list IS mutable
		// ... THERE IS NO NEED TO DECLARE A NEW LIST TO CONTAINS THE SORTED RETURN

		System.out.println();

		for( int i = 0; i < names.size(); i++){
			System.out.println("Names List, names[" + i + "] is: " + names.get(i));
		}

		System.out.println();

		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		System.out.println("REVERSE names");

		Collections.reverse(names);
		// Not only does the  Collections class provide methods to sort, the list IS mutable
		// ... THERE IS NO NEED TO DECLARE A NEW LIST TO CONTAINS THE SORTED RETURN

		System.out.println();

		for( int i = 0; i < names.size(); i++){
			System.out.println("Names List, names[" + i + "] is: " + names.get(i));
		}

		System.out.println();
		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		for(String name: names){
			System.out.println(name + " is in the List<String> of names");
			System.out.println(name.toUpperCase());
		}

		System.out.println();

		//REMEMBER, Strings are immutable
		for(String name: names) {
			System.out.println(name + " is in the List<String> of names");
		}

		//HOWEVER... What about Objects that are mutable??

		Dog dog1 = new Dog("Spot");
		Dog dog2 = new Dog("Fido");
		Dog dog3 = new Dog("Lassie");
		Dog dog4 = new Dog("RinTinTin");
		Dog dog5 = new Dog("Rover");

		List<Dog> myKennel = new ArrayList<>();

		myKennel.add(dog1);
		myKennel.add(dog2);
		myKennel.add(dog3);
		myKennel.add(dog4);
		myKennel.add(dog5);

		System.out.println();

		for(Dog dog: myKennel){
			System.out.println("Welcome " + dog.name);
			dog.knightMe();
		}

		System.out.println();

		for(Dog dog: myKennel){
			System.out.println("Me: Welcome " + dog.name);
			System.out.println(dog.name + ": " + dog.sound);

		}

		System.out.println();
		//AS you iterate over a list using a ForEach loop, each of the object reference
		//in the list IS a reference back to the underlying object as demonstrated below

		System.out.println("Holy References Batman, dog1 IS changed!");
		System.out.println(dog1.name);

	}
}
