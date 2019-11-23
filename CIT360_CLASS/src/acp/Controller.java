package acp;

import java.util.HashMap;

public class Controller {
	public static HashMap<String, Handler> cmd = new HashMap<String, Handler>();
	
	public Controller() {
		
	}
	
	public static void handleOperator(String oper, Integer int1, Integer int2) {
		cmd.put("add", new Add());
		cmd.put("sub", new Subtract());
		Handler handler = cmd.get(oper);
		handler.execute(int1, int2);
	}
	
	
	
}
