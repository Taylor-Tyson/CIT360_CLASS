package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;

public class list {
	static ArrayList<String> truckList = new ArrayList<String>();
	
	/****************************************************
	 * Constructor: list	
	 *
	 * Purpose    : Creates a default list
	 ****************************************************/
	public list()
	{
		truckList.add("Ford");
		truckList.add("Dodge");
		truckList.add("Chevrolet");
		truckList.add("BMW");
		truckList.add("Volkswagon");
		truckList.add("Toyota");
		System.out.println("Trucks have been created.");
		System.out.println();
	}

	/****************************************************
	 * Method     : runMethods
	 *
	 * Purpose    : this will run through the methods.
	 *
	 ****************************************************/
	private static void runMethods() {
		System.out.println("Adding truck: I am a new truck");
		addTruck("I am a new truck");
		System.out.println("Deleting I am a new truck");
		deleteTruck(6);
		System.out.println("Trying to delete I am a new truck again.");
		deleteTruck(6);
		System.out.println("Sorting trucks.");
		sortTruck(truckList);
		System.out.println("Clearing all trucks.");
		clearTruck();
	}
	
	/****************************************************
	 * Method     : addTruck
	 *
	 * Purpose    : This will add a truck to the List.
	 *
	 ****************************************************/
	private static void addTruck(String brand) 
	{
		truckList.add(brand);
		displayTrucks();
		System.out.println();
	}
	
	/****************************************************
	 * Method     : deleteTruck
	 *
	 * Purpose    : This will check if the list is empty and
	 * 				then delete. 
	 *
	 ****************************************************/
	private static void deleteTruck(int num)
	{
		int loc = num;
		try
		{
			if(truckList.size() == 0)
				throw new Exception();
			else
			{
				System.out.println("Location " + loc + " containing " + truckList.get(loc) + " will now be deleted.\n");
				truckList.remove(loc);
				displayTrucks();
			}
		}
		catch (Exception e)
		{
			System.out.println("Truck at location " + loc + " does not exist.");
		}
		System.out.println();
	}
	
	/****************************************************
	 * Method     : sortTruck
	 *
	 * Purpose    : This will check if the list is empty and
	 * 				then it will sort the contents of the list
	 * 				in alphabetical order. 
	 *
	 ****************************************************/
	private static void sortTruck(ArrayList<String> list)
	{
		try
		{
			if(list.size() == 0)
				throw new EmptyStackException();
			else
			{
				Collections.sort(list);
				displayTrucks();
				System.out.println();
			}
		}
		catch (EmptyStackException e)
		{
			
		}
	}
	
	/****************************************************
	 * Method     : clearTruck
	 *
	 * Purpose    : This will check if the list is empty and
	 * 				then it will clear the contents.
	 *
	 ****************************************************/
	private static void clearTruck()
	{
		try
		{
			if(truckList.size() == 0)
				throw new EmptyStackException();
			else
			{
				truckList.clear();
				displayTrucks();
			}
		}
		catch (EmptyStackException e)
		{
			
		}
		System.out.println("All trucks cleared.\n");
	}

	/****************************************************
	 * Method     : displayTrucks
	 *
	 * Purpose    : This will check to see if the list is empty
	 * 				and if not it will print out all locations
	 * 				that are not equal to null. 
	 *
	 ****************************************************/
	public static void displayTrucks()
	{
		Object temp;
		try
		{
			if(truckList.size() == 0)
				throw new EmptyStackException();
			else
			{
				for(int i = 0; i <= truckList.size() - 1; i++)
				{
					temp = truckList.get(i);
					if(temp != null)
						System.out.println(temp + " at location: " + i);
				}
			}
		}
		catch(EmptyStackException e)
		{
			
		}
	}	
	
	/****************************************************
	 * Method     : main
	 *
	 * Purpose    : This gets things going.  
	 *
	 ****************************************************/
	public static void main(String[] args)
	{
		new list();
		runMethods();
	}
}
