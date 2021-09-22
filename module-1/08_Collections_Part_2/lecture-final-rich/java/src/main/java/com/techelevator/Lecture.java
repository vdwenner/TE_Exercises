package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		//Declaration of Maps

		Map<String, String> nameToZip = new HashMap<String, String>();

		//Let's put some Map Entries into the map

		nameToZip.put("Bob", "19103");
		nameToZip.put("Mary", "19129");
		nameToZip.put("Kory", "19125");
		nameToZip.put("Adam", null);

		//Let's retrieve (get) and entry

		//Using a variable for the get
//		String bobZip = nameToZip.get("Bob");
//		System.out.println("Bob lives in " + bobZip);

		//In-line version
		System.out.println("Bob lives in " + nameToZip.get("Bob"));
		System.out.println("Mary lives in " + nameToZip.get("Mary"));
		System.out.println("Kory lives in " + nameToZip.get("Kory"));

		System.out.println();
		System.out.println("-- retieving the keys");
		System.out.println();


		//What about Maps using Set<T> for its Keys?

		//Let's get the KeySet

		Set<String> names = new HashSet<>();
		names = nameToZip.keySet();

		System.out.println("The Name Keys are: ");


		// Sets are UNORDERED
		System.out.println();
		System.out.println("-- Notice the change in order");
		System.out.println();

		for(String name: names){
			System.out.println(name );
		}

		//Visualize the Map.Entries
		System.out.println();
		System.out.println("-- Visualize the Map.Entries");
		System.out.println();

		for(Map.Entry<String, String> entry: nameToZip.entrySet()){
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}

		//Let's see if an entry exists

		System.out.println();
		System.out.println("-- Let's see if an entry exists");
		System.out.println();

		if(nameToZip.containsKey("Kory")){
			System.out.println("Kory is in the Map with a value of: " + nameToZip.get("Kory"));
		}

		if(nameToZip.containsKey("Brian")){
			System.out.println("Brian is in the Map with a value of: " + nameToZip.get("Brian"));
		}

		//If a key does not exist, calling get on that key returns null
		System.out.println("Print Brian's value: " + nameToZip.get("Brian"));

		//... this is why null as a value is problematic
		System.out.println();
		System.out.println("... this is why null values are problematic");
		System.out.println();

		System.out.println("Print Adam's value: " + nameToZip.get("Adam"));



		System.out.println("Brian's null is " + (nameToZip.containsKey("Brian")?"":"not ") + "real" );
		System.out.println("Adam's null is " + (nameToZip.containsKey("Adam")?"":"not ") + "real" );

		//Removing an entry from the map
		System.out.println();
		System.out.println("-- Removing an entry from the map");
		System.out.println();

		String nameToremove = "Jerry";
		//the remove method WILL return the value associated with the removed entry's key
		System.out.println("The entry for " + nameToremove + " was removed with it's value of: " + nameToZip.remove(nameToremove));

	}

}
