/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dummypackage;

/**
 *
 * @author sello daniel
 */
public class overload 
{
      
    public static void main(String[] args)
    {
        
        System.out.printf("Square of 25 is %d\n",square(25));
        System.out.printf("Square of 25.5 is " ,square(25.5));
    }
    
    
    
    public static int square (int intvalue)
    {
            
         System.out.printf("\n Called square with int argument: %d\n", intvalue);
         return intvalue * intvalue;
    }
    
    
    
    public static double square (double doublevalue)
    {
        System.out.printf("\n Called square with double argument: %f\n", doublevalue);
        return doublevalue * doublevalue;
    }
}
