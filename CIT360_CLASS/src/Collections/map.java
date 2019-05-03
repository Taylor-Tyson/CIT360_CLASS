package Collections;
import java.util.*;
import java.util.Map.Entry; 

public class map {
	static Map<Integer, String> animals = new HashMap<Integer, String>();
	Iterator<Entry<Integer, String>> iterator = animals.entrySet().iterator();
	
	/****************************************************
	 * Constructor: map	
	 *
	 * Purpose    : Creates a default map
	 ****************************************************/
	public map()
	{
		animals.put(2,"Zebra");
		animals.put(30,"Dog");
		animals.put(10,"Cat");
		animals.put(9,"Elephant");	
		System.out.println("Animals have been created.");
		System.out.println();
		displayAnimals();
	}

	/****************************************************
	 * Method     : runMethods
	 *
	 * Purpose    : this will run through the methods.
	 *
	 ****************************************************/
	private static void runMethods() {
		System.out.println("Search for cat.");
		searchAnimal("Cat");
		System.out.println("Search for Horse.");
		searchAnimal("Horse");
		System.out.println("Clearing animals.");
		clearAnimals();
	}
	/****************************************************
	 * Method     : searchAnimal
	 *
	 * Purpose    : This will check for an animal in the map.  
	 *
	 ****************************************************/
	private static void searchAnimal(String animal) 
	{
	
		if (animals.containsValue(animal))
		{
			System.out.println(animal + " exists.");
		}
		else
		{
			System.out.println(animal + " does not exist.");
		}	
		System.out.println();
	}
	
	/****************************************************
	 * Method     : displayAnimals
	 *
	 * Purpose    : This will check display all the animals in the map.  
	 *
	 ****************************************************/
	public static void displayAnimals() 
	{
		for(Integer key: animals.keySet())
        System.out.println(key + " - " + animals.get(key));
        System.out.println();  
	}
	
	/****************************************************
	 * Method     : clearAnimals
	 *
	 * Purpose    : This will clear animals.   
	 *
	 ****************************************************/
	public static void clearAnimals() {
		animals.clear();
		System.out.println("Animals cleared");
	}

	/****************************************************
	 * Method     : main
	 *
	 * Purpose    : This gets things going.  
	 *
	 ****************************************************/
	public static void main(String[] args)
	{
		new map();
		runMethods();
	}
}
	    
	    
	    
	    
	    
	    
	    
	    
	    