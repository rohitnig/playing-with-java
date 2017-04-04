/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtests;

/**
 *
 * @author rpnigam
 */
public class StringTests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a="str1str2";
        String b="str1";
        String c="str2";
        String d=b+c;
        String e=new String("str1"+"str2");
        String f=new String("str1str2");
        String g=new String("str1str2");
        System.err.println("Test1: "+(a==d));
        System.out.printf("Locations: %s,\n%s, %s, %s.\n"
                , Integer.toHexString(System.identityHashCode(a))
                , Integer.toHexString(System.identityHashCode(e))
                , Integer.toHexString(System.identityHashCode(f))
                , Integer.toHexString(System.identityHashCode(g)));
        System.err.println("Test1: "+(f==g)+" "+f.equals(e));

        long startTime = System.currentTimeMillis();  
        concatWithString();  
        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");  
        startTime = System.currentTimeMillis();  
        concatWithStringBuffer();  
        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");  
    }
    
    public static String concatWithString()    {  
        String t = "Java";  
        for (int i=0; i<10000; i++){  
            t = t + "Tpoint";  
        }  
        return t;  
    }  
    public static String concatWithStringBuffer(){  
        StringBuffer sb = new StringBuffer("Java");  
        for (int i=0; i<10000; i++){  
            sb.append("Tpoint");  
        }  
        return sb.toString();  
    }  
}
