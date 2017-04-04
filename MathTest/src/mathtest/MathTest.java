/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathtest;

/// import java.lang;

/**
 *
 * @author rpnigam
 */
public class MathTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=-1, j=1;
        
        System.out.println("" + i + " " + j);
        System.out.println("i: " + Math.ceil(i+0.6) + " " + Math.round(i+0.6));
        System.out.println("j: " + Math.ceil(j+0.6) + " " + Math.round(j+0.6));
        System.out.println("j: " + Math.ceil(i+0.5) + " " + Math.round(i+0.5));
    }
    
}
