package acp;

public class Add implements Handler {
	public void execute(Integer int1, Integer int2) {
		int sum = int1 + int2;
		System.out.println(int1 + " + " + int2 + " = " + sum);
	}

}
