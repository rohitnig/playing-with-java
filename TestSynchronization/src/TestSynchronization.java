class Table{  
	  synchronized static void printTable(int n) {//synchronized method
				for(int i=1;i<=5;i++){
					System.out.println(n*i);
					try{  
						Thread.sleep(2);  
					}catch(Exception e){System.out.println(e);}  
				}
	  }
}  

public class TestSynchronization {

	public static void main(String[] args) {
//		final Table obj = new Table();//only one object  
	    Thread t1=new Thread(){  
	        public void run(){  
	            Table.printTable(1);  
	        }  
	    };  
	      
	    Thread t2=new Thread(){  
	        public void run(){  
	        	Table.printTable(10);  
	        }  
	    };  
	      
	    Thread t3=new Thread(){  
	        public void run(){  
	        	Table.printTable(100);  
	        }  
	    };  
	      
	    Thread t4=new Thread(){  
	        public void run(){  
	        	Table.printTable(1000);  
	        }
	    };

	    t1.start();  
	    t2.start();  
	    t3.start();  
	    t4.start();  
	}
}

