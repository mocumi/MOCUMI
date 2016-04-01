/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dummypackage;
import java.util.Scanner;

/**
 *
 * @author sello 0daniel
 */
public class NewClass 
{
 
  
public static void main(String[] args) 
	{
		double amount ;//declare amount
		double principal= 1000.0;//declare principal amount and instantiate 
		double rate = 0.3;//declare rate and instantiate 
                int interestchoice=0;//declare interestchoice and instantiate
                Scanner in = new Scanner(System.in);//create scanner
               
                
              
                 do {
                     
                     
                     
                     
                     
                     
                System.out.println("please enter your interst choice\n 0 is for Compound interest 1 is for Simple interest ");
                 interestchoice= in.nextInt();//accept input for iterest
                     
                     
                     
                     
                     
                 //creating switch containing loops
                switch (interestchoice)
                {
                    case 0:
                        for(int year = 1; year<=12; year++)//initializing for loop
		{     
			amount =principal * Math.pow(1.0 + rate ,year);//calculating compound interest
			System.out.printf("%4d%,40.2f\n", year,+amount);//displaying interest
			
			
		}break;
                        
                    case 1:
                        
                        
                        int year=1;//instatiating year
                       
                     
                       
                        
                          System.out.printf("%s%40s\n", "Year", "Amount on Deposit");
                            for (year=1;year<=12;year++)
                            {
                                amount = principal*(1+rate*year);
                                
                                System.out.printf("%4d%,40.2f\n", year,amount);
                            }break;
                            
                  //default: System.out.println("Please enter the valid amount");
                           
                }
                
             
                 }
                 while(interestchoice >=1);
                 {
                     System.out.println("wrong option chosen");
                     System.exit(0);
        }
                    
        }
}

                     

                
        