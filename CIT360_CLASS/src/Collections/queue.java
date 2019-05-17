package Collections;
import java.util.*;

public class queue {
	
	static Queue<String> waitingQueue = new LinkedList<>();
	Iterator<String> iterator = waitingQueue.iterator();
	
	/****************************************************
	 * Constructor: queue	
	 *
	 * Purpose    : Creates a default queue
	 ****************************************************/
	public queue()
	{
		waitingQueue.add("George");
        waitingQueue.add("Jim");
        waitingQueue.add("Stacy");
        waitingQueue.add("Doug");
        waitingQueue.add("Melanie");
        System.out.println("The waiting queue has been created.");
		System.out.println();
	}

	/****************************************************
	 * Method     : runMethods
	 *
	 * Purpose    : this will run through the methods.
	 *
	 ****************************************************/
	private static void runMethods() {
		System.out.println("Displaying the queue.");
		displayQueue();
		whosNext();
		checkQueue("Jim");
		checkQueue("Tyson");
		
	}
	
	/****************************************************
	 * Method     : displayQueue
	 *
	 * Purpose    : This will check display the queue.  
	 *
	 ****************************************************/
	public static void displayQueue() 
	{
		for(Object object : waitingQueue) {
			String element = (String) object;
			System.out.println(element);
		}  
		System.out.println();
	}
	
	/****************************************************
	 * Method     : whosNext
	 *
	 * Purpose    : This will show the top of the queue. 
	 *
	 ****************************************************/
	public static void whosNext() {
		System.out.println("Checking for the next person in line.");
		System.out.println("The next person in line is: " + waitingQueue.peek());
		System.out.println();
	}
	
	public static void checkQueue(String who) {
		System.out.println("Checking if " + who + " is in the queue.");
		if(waitingQueue.contains(who)){
            System.out.println(who + " is in the queue.");
        } else {
            System.out.println(who + " is not in the queue.");
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
		new queue();
		runMethods();
	}
	
}