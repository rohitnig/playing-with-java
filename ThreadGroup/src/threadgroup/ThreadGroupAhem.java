/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadgroup;

/**
 *
 * @author rpnigam
 */
public class ThreadGroupAhem implements Runnable {

    /**
     * @param args the command line arguments
     */
    public void run() {  
          System.out.println(Thread.currentThread().getName());  
    }  

    public static void main(String[] args) {
        ThreadGroupAhem runnable = new ThreadGroupAhem();  
        ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");  

        Thread t1 = new Thread(tg1, runnable,"one");  
        t1.start();  
        Thread t2 = new Thread(tg1, runnable,"two");  
        t2.start();  
        Thread t3 = new Thread(tg1, runnable,"three");  
        t3.start();  

        System.out.println("Thread Group Name: "+tg1.getName());  
        tg1.list();
    }
    
}
