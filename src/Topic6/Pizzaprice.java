
package Topic6;

/**
 *
 * @author sello daniel
 */
public class Pizzaprice
{
    
    public static void main(String[] args)
    {
  
        
        Sizes cumis = new Sizes(null);//create object reference
        
        cumis.getFlav();//calling a method
            cumis.PrintFlav();//calling a method
        
        /*
            calling methods and displaying their contents
            overloading methods with different primitives
            
            */
        System.out.printf("\nthe amount of small pizza is %s\n",cumis.smallsize(0));
        System.out.printf("the amount of medium pizza is %f\n",cumis.mediumsize(0.0));
        System.out.printf("the amount of large pizza is %f\n",cumis.largesize(0.0));
        
    
    }
    
}
