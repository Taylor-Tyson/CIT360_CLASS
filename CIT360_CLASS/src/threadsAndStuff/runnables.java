package threadsAndStuff;

public class runnables implements Runnable{  
	public void run(){  
		
		for (int i = 0; i < 10; i++) {		
			System.out.println("I am printed from runnables: " + Thread.currentThread().getName());
		
			try {
				Thread.currentThread();
				Thread.sleep(10);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
}  
  
public static void main(String args[]){  
	runnables m1=new runnables();  
	Thread t1 =new Thread(m1);  
	runnables m2=new runnables();  
	Thread t2 =new Thread(m2);  
	t1.start();
	t2.start();
 }  
}  




