package Collections;
import java.util.*; 

public class set {
	static Set<Integer> nums = new HashSet<>();
	static Iterator<Integer> iterator = nums.iterator();
	
	/****************************************************
	 * Constructor: set	
	 *
	 * Purpose    : Creates a default set
	 ****************************************************/
	public set()
	{
		nums.add(1);
		nums.add(52);
		nums.add(3);
		nums.add(7854);
		nums.add(254);
		nums.add(641);
		System.out.println("The number set has been created.");
		System.out.println();
	}
	
	/****************************************************
	 * Method     : runMethods
	 *
	 * Purpose    : this will run through the methods.
	 *
	 ****************************************************/
	private static void runMethods() {
		System.out.println("Displaying the set.");
		displayNums();
		System.out.println("Adding 100 to nums.");
		addNum(100);
		deleteNum(100);
		deleteNum(20);
		clearNums();
		clearNums();
	}
	
	/****************************************************
	 * Method     : addNum
	 *
	 * Purpose    : This will add a number to the set. 
	 * 				
	 ****************************************************/
	private static void addNum(int newNum) 
	{
		if (!nums.add(newNum))
		{
			System.out.println(newNum + " already exists.");
		}
		else
		{
			nums.add(newNum);
		}
		displayNums();
	}
	
	/****************************************************
	 * Method     : deleteNum
	 *
	 * Purpose    : This will delete a number from the set. 
	 *
	 ****************************************************/
	public static void deleteNum(int delete)
	{
		System.out.println("Trying to delete " + delete + ".");
		if (nums.contains(delete))
		{
			nums.remove(delete);
			System.out.println(delete + " has been deleted.");
			displayNums();
		}
		else
		{
			System.out.println(delete + " is not a listed number.");
		}	
		System.out.println();
	}
	
	/****************************************************
	 * Method     : clearNums
	 *
	 * Purpose    : This will clear all the numbers.
	 * 
	 ****************************************************/
	public static void clearNums()
	{
		System.out.println("Clearing numbers.");
		try
		{
			if(nums.isEmpty())
				throw new EmptyStackException();
			else
			{
				nums.clear();
				System.out.println("Numbers have been cleared.");
				displayNums();
			}
		}
		catch (EmptyStackException e)
		{
			System.out.println("There are no numbers to clear.");
		}
		System.out.println();
	}
	
	/****************************************************
	 * Method     : displayNums
	 *
	 * Purpose    : This will display the numbers
	 *
	 ****************************************************/
	public static void displayNums()
	{
		iterator = nums.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
		System.out.println();
	}	
	
	
	/****************************************************
	 * Method     : main
	 *
	 * Purpose    : This gets things going.  
	 *
	 ****************************************************/
	public static void main(String[] args)
	{
		new set();
		runMethods();
	}
}


