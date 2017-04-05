package java_tests;

class Table{  
	  void printTable(int n) {//synchronized method
			synchronized(this){
				for(int i=1;i<=5;i++){
					System.out.println(n*i);
					try{  
						Thread.sleep(2);  
					}catch(Exception e){System.out.println(e);}  
				}
		   }  
	  }
}  


class MyThread1 extends Thread{ 
	Table t;  
	MyThread1(Table t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(5);  
	}  
  
}  
class MyThread2 extends Thread{  
	Table t;  
	MyThread2(Table t){  
		this.t=t;  
	}  
	
	public void run(){  
		t.printTable(100);
	}  
}  


public class TestSynchronization {

	public static void main(String[] args) {
		final Table obj = new Table();//only one object  
		Thread t1=new Thread() {
			public void run(){ obj.printTable(5); }  
		};  
		MyThread2 t2=new MyThread2(obj);  
		t1.start();  
		t2.start();  
	}
}
