
package Topic6;
import java.util.Scanner;

/**
 *
 * @author sello daniel
 */
public class Sizes
{
    Scanner sc = new Scanner(System.in);
    
    /*
    variable with a static
    */
    private static String flavor;
    /*
    overloaded constructors 
    */
    Sizes(String newflavor)
    {
      newflavor = flavor;
    }
    
     /*
    overloaded constructors 
    */
    Sizes(boolean check)
    {
        check=true;
        
    }

  /*
    public method containing choice of a pizza
    */
    public  void getFlav()
    {   
          System.out.println("Choose flavour of your Pizza");
          flavor = sc.nextLine();   
         
    
    }
/*
    displaying pizza choice
    */
     public static void PrintFlav()
    {
         System.out.printf("\nhere is your flavor :"  + flavor + "\n" );   
    
    }
    
    
    
    /*
     return overloaded method 
     */
    public  int  smallsize(int  price)
    {
        price =5;//instantiating an object
        return price;
       
    }
    
    /*
     return overloaded method 
     */
    public  double mediumsize(double price1)
    {
        price1 = 10.5;//instantiating an object
        return price1;
        
    }
    
    /*
     return overloaded method 
     */
    public  double largesize(double price2)
    {
        price2 = 20.5;//instantiating an object
       return price2;
    }
    
}