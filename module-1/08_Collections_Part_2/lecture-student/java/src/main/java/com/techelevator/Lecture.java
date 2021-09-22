package com.techelevator;

import java.util.HashMap;
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
		nameToZip.put("Mary", "19124");
		nameToZip.put("Kory", "19102");

		//Let's retrieve (get) and entry

		String bobZip = nameToZip.get("Bob");
		System.out.println("Bob lives in " + bobZip);

		//In-Line version
		System.out.println("Bob lives in " + nameToZip.get("Bob"));





	}

}
