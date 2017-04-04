/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interactivehello;

import java.util.Scanner; // Bring in the scanner to read input

/**
 *
 * @author mafudge
 */
public class InteractiveHello {

    private static void playon() {
        int i[] = {1};
        int large_array[] = new int[255];
        int max_int=255;
        change_i(i);
        
        large_array[254]=8; 
        
        large_array[253]=10;
        System.out.println("i:"+i[0]);
        System.err.println("max_int is "+max_int);
        System.err.println("array length is "+large_array.length+" and the last one is " + 
                large_array[large_array.length-1]);

        if( "Welcome".trim() == "Welcome".trim() )
        System.out.println("Equal");
        else
        System.out.println("Not Equal");
    }
    
    public static void change_i(int i[]) 
    {
        int j[] = {2};
        System.out.println("j:"+j[0]);
        i = j;
        //i[0]=2;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make new object of class Scanner, based on System.in and call it input
        Scanner input = new Scanner(System.in);
        //System.out.print("Enter your name ==> ");                
        //String yourName = input.nextLine();
        System.out.printf("Hello, %s!!!!!\n", "rohit"); // say hello
        System.err.println("" + (14^23));
        System.err.println(""+ ("Welcome".trim()=="Welcome".trim()));
        playon();
    }
}
