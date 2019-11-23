package threadsAndStuff;


public class threads extends Thread {
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I was printed from threads: " + Thread.currentThread().getName());
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Hello, I am a thread. Nice to meet you.");
		
		for (int ct = 0; ct < 5; ct++) {
			threads myThread = new threads();
			myThread.start();
		}
	}
}

