package acp;

public class Subtract implements Handler {
	public void execute(Integer int1, Integer int2) {
		int calc = int1 - int2;
		System.out.println(int1 + " - " + int2 + " = " + calc);
	}

}