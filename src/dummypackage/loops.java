package dummypackage;
import java.util.Scanner;


 class loop {

public static void main(String[] args) 
	{
		double amount ;
		double principal;
		double rate = 0.3;
                Scanner in = new Scanner(System.in);
                
          
                System.out.println("Please enter your principal amount");
                principal = in.nextDouble();
                
                System.out.println("THE COMPOUND INTEREST FOR TWELVE YEARS\n ");
		System.out.printf("%s%40s\n", "Year", "Amount on Deposit");
		
		for(int year = 1; year<=12; year++)
		{
			amount =principal * Math.pow(1.0 + rate ,year);
			System.out.printf("%4d%,40.2f\n", year,+amount);
			
			
		}

	}




}