package thread_package;

public class ThreadInterrupter extends Thread {

	public void run(){  
		try{  
			Thread.sleep(1000);  
			System.out.println("task");  
		}
		
		catch(InterruptedException e){  
			throw new RuntimeException("\n\nThread interrupted... "+e);  
		}  
	}

	public static void main(String[] args) {
		ThreadInterrupter t1=new ThreadInterrupter();  
		t1.start();  
		try{  
			t1.interrupt();  
		}
		catch(Exception e){System.out.println("Exception handled "+e);}  
		  
		}  

}
