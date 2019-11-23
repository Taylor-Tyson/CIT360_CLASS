package acp;

import java.util.Scanner;

public class AcpApp {
	static Scanner scanner = new Scanner(System.in);
	static Integer in1;
	static Integer in2;
	static String calc;
	static int menuSelection;
	
	
	private static void runAcp() {
		int loop = 1;
				
		while(loop == 1) {
			switch(menuSelection) {
			case 1:
				calc = "add";
				promptInt();
				Controller.handleOperator(calc, in1, in2);
				displayMenu();
				break;
			case 2:
				calc = "sub";
				promptInt();
				Controller.handleOperator(calc, in1, in2);
				displayMenu();
				break;			
			case 3:
				System.out.println("Thanks for coming!");
				System.exit(0);
				break;
			}	
		}
		
	}
	
	private static void displayMenu() {
		System.out.println();
		System.out.println("What would you like to do?");
		String [] menu = {"Add", "Subtract", "Exit"};
		menuSelection = IO.makeMenu(menu);
	}
	
	private static void promptInt() {
		in1 = IO.promptForInt("Please enter a number: ", 0, 9999);
		in2 = IO.promptForInt("Please enter another number: ", 0, 9999);
	}
	
	public static void main(String[] args) {
		displayMenu();
		runAcp();
	}	
}
