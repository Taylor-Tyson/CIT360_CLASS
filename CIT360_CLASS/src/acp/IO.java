package acp;

/********************************************************
*  Author    :  Tyson Taylor
*
*  Description : This is an IO testing class. 
*
*    1) What is the purpose of the code?
*    	 - This has methods to test for ints, strings, 
*    	   chars, doubles, boolean, and to make a menu
*    	   of choices. 

*  Changes :  <Description|date of modifications>
*
********************************************************/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

	/****************************************************
	 * Method     : promptForInt
	 *
	 * Purpose    : This will check that an int is entered
	 * 				correctly. The String that is passed
	 * 				is the prompt that you want to ask and
	 * 				the min and max are the ints passed for
	 * 				the range to have entered.  		 
	 *
	 * Parameters : String prompt, int min, int max
	 *
	 * Returns    : int
	 *
	 ****************************************************/
	public static int promptForInt(String prompt, int min, int max) {
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		boolean valid = false;
		int myInt = 0;
		
		while (valid == false) {
		    try {
		    	System.out.print(prompt);
		    	String ints = keyboard.readLine();
				myInt = Integer.parseInt(ints);
				
		        if(myInt >= min && myInt <= max) {
		        valid = true;
		        }
		        else if(myInt < min || myInt > max) {
		        	System.out.println("Error: Number out of range, please enter a number between " + min + " and " + max +":");
		        }
		    }
		  	catch (IOException e){
				System.out.println("Error: " + e);
			}
			catch(NumberFormatException e) {
				System.out.println("Error: please enter a valid entry");
			}
		}
		return myInt;
	}

	/****************************************************
	 * Method     : promptForDouble
	 *
	 * Purpose    : This will check that a double is entered
	 * 				correctly. The String that is passed
	 * 				is the prompt that you want to ask and
	 * 				the min and max are the doubles passed for
	 * 				the range to have entered.  		 
	 *
	 * Parameters : String prompt, double min, double max
	 *
	 * Returns    : double
	 *
	 ****************************************************/
	public static double promptForDouble(String prompt, double min, double max) {
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		boolean valid = false;
		double myDouble = 0;
		
		while(valid == false) {
			try {
				System.out.println(prompt);
				String doubles = keyboard.readLine();
				myDouble = Double.parseDouble(doubles);
			
				if(myDouble >= min && myDouble <= max) {
					valid = true;
				}
				else if(myDouble < min || myDouble > max) {
					System.out.println("Error: Number out of range, please enter a number between " + min + " and " + max +":");
				}
			}
			catch(IOException e) {
				System.out.println("Error: " + e);
			}
		}
		return myDouble;
	}

	/****************************************************
	 * Method     : promptForBoolean
	 *
	 * Purpose    : This will check that a boolean is entered
	 * 				correctly. The String that is passed
	 * 				is the prompt that you want to ask.  		 
	 *
	 * Parameters : String prompt
	 *
	 * Returns    : boolean
	 *
	 ****************************************************/
	public static boolean promptForBoolean(String prompt) {
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		boolean myBoolean = false;
		boolean valid = false;
		
		while(valid == false) {
			try {
				System.out.println(prompt);
				String booleanTest = keyboard.readLine();
				if (booleanTest.equalsIgnoreCase("true") || booleanTest.equalsIgnoreCase("false")) {
					valid = true;
					myBoolean = Boolean.parseBoolean(booleanTest);
				}
				else { 
					System.out.println("Error: Please enter a true or false answer.");
				}
			}
			catch (IOException e) {
				System.out.println("Error: " + e);
			}
		}
		return myBoolean;
	}

	/****************************************************
	 * Method     : promptForString
	 *
	 * Purpose    : This will check that a String is entered
	 * 				correctly. The String that is passed
	 * 				is the prompt that you want to ask.  		 
	 *
	 * Parameters : String prompt
	 *
	 * Returns    : String
	 *
	 ****************************************************/
	public static String promptForString(String prompt) {
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		String myString = "";
		boolean valid = false;
		
		while (valid == false) {
			try {
				System.out.println(prompt);
				myString = keyboard.readLine();
				
				if(myString.equals("")) {
					System.out.println("Error: PLease enter a string.");
				}
				else {
					valid = true;
				}
			}
			catch (IOException e) {
				System.out.println("Error: " + e);
			}
		}
		return myString;
	}

	/****************************************************
	 * Method     : promptForChar
	 *
	 * Purpose    : This will check that a char is entered
	 * 				correctly. The String that is passed
	 * 				is the prompt that you want to ask. 		 
	 *
	 * Parameters : String prompt
	 *
	 * Returns    : char
	 *
	 ****************************************************/
	public static char promptForChar(String prompt) {
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		char myChar = ' ';
		boolean valid = false;
		
		while(valid == false) {
			try {
				System.out.println(prompt);
				String enteredChar = keyboard.readLine();
				myChar = enteredChar.charAt(0);
				
				if(Character.isAlphabetic(myChar)) {
					valid = true;
				}
				else {
					System.out.println("Error: Please enter a valid entry.");
				}
			}
			catch(IOException e) {
				System.out.println("Error: " + e);
			}
			catch(IndexOutOfBoundsException e) {
				System.out.println("Error: " + e);
			}
		}
		return myChar;
	}

	/****************************************************
	 * Method     : makeMenu
	 *
	 * Purpose    : This will make a menu by passing
	 * 				an array of the choices you want
	 * 				to have available. It uses the 
	 * 				promptForInt method to make sure
	 * 				a correct selection is made.   		 
	 *
	 * Parameters : String []
	 *
	 * Returns    : int
	 *
	 ****************************************************/
	public static int makeMenu(String[] menu) {
		int min = 1;

		for (int i = 0; i < menu.length; i++) {
			System.out.println((i + 1) + ": " + menu[i]);
		}
		return promptForInt("Menu Selection: ", min, menu.length);
	}
}


			
			
