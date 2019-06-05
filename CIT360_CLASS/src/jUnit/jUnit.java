package jUnit;

public class jUnit {
	
	static int a;
	static int b;
	
	/****************************************************
	 * Method : sum
	 ****************************************************/
	public static int sum (String numA, String numB) {
		if (checkInt(numA) && checkInt(numB) == true) {
			a = Integer.parseInt(numA);  
			b = Integer.parseInt(numB);
			return a + b;
		}
		else {
			return 0;
		}	
	}
	
	/****************************************************
	 * Method : sub
	 ****************************************************/
	public static int sub (String numA, String numB) {
		if (checkInt(numA) && checkInt(numB) == true) {
			a = Integer.parseInt(numA);  
			b = Integer.parseInt(numB);
			return a - b;
		}
		else {
			return 0;
		}	
	}
	
	/****************************************************
	 * Method : multiply
	 ****************************************************/
	public static int multiply (String numA, String numB) {
		if (checkInt(numA) && checkInt(numB) == true) {
			a = Integer.parseInt(numA);  
			b = Integer.parseInt(numB);
			return a * b;
		}
		else {
			return 0;
		}		
	}
	
	/****************************************************
	 * Method : divide
	 ****************************************************/	
	public static int divide (String numA, String numB) {
		if (checkInt(numA) && checkInt(numB) == true){
			a = Integer.parseInt(numA);  
			b = Integer.parseInt(numB);
			
				if (divideByZero(b)== true){
					return a/b;
				}
		}
		return 0;
	}
			
	/****************************************************
	 * Method : divideByZero
	 ****************************************************/
	public static boolean divideByZero (int numA) {
		try 
		{
			if (numA == 0)
				throw new ArithmeticException();
			else 
			 return true;	
		}
		catch (ArithmeticException e) {
			return false;
		}
	}
	
	/****************************************************
	 * Method : checkInt
	 ****************************************************/	
	public static boolean checkInt (String numA) {
		try {
			Integer.parseInt(numA);
		}
		catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}
