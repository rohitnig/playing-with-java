/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathreads;

/**
 *
 * @author rpnigam
 */
class HereThread extends Thread {
    private static int threadcount;
    private String threadName="";
    
    public HereThread () {
        System.err.println("\tC'tor called");
    }
    
    public void run () {
        threadcount++;
        this.setName("\tThreadId"+threadcount);
        threadName = this.getName();
        
        System.out.println(threadName+": Created and going to sleep ...");
        
        try {   Thread.sleep(2000);    } 
        catch (InterruptedException e)  {   System.out.println(threadName+": "+e);  }
        
        System.err.println(threadName+": Back!!");
    }
}

public class JavaThreads  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HereThread [] ht = new HereThread[10];
        System.out.println("Entering the loop...");
        for (int i=0; i<10; i++) {
            System.err.println("Creating thread: "+(i+1));
            ht[i] = new HereThread();
            System.err.println("Now Starting: "+(i+1));
            ht[i].start();
        }
    }
}
