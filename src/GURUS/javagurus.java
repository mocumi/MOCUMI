/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GURUS;
/**
 * import all required classes
 */
import java.io.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;


/**
 *
 * @author MOCUMI
 */
public class javagurus
{
    private Scanner list,list1;
	
	public void openFile()
	{
            /**
             * opening text files 
             * checking if they exist using try and catch method
             */
		
		try{
			list=new Scanner(new File ("C:\\Users\\sello daniel\\Documents\\NetBeansProjects\\MOCUMI\\src\\GURUS\\s.txt"));
                        list1=new Scanner(new File("C:\\Users\\sello daniel\\Documents\\NetBeansProjects\\MOCUMI\\src\\GURUS\\certificates.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("list doesn't exist");
		}
	}
	/**
         * creating default table to 
         * display names of the jumpstarters
         * create local times 
         * @return 
         */
	public DefaultTableModel readFile()
	{
            openFile();
            
            DefaultTableModel dtm = new DefaultTableModel();
            LocalDate sdate= LocalDate.of(2015, 10, 06);
            LocalDate curr= LocalDate.of(2016, 10, 31);
            LocalDate edate= LocalDate.now();
            Period p1 = Period.ofMonths(12);
           
            /**
             * creating columns for table
             */
            dtm.addColumn("NAME");
            dtm.addColumn("SURNAME");
            dtm.addColumn("GENDER");
            dtm.addColumn("START DATE");
            dtm.addColumn("CURRENT DATE");
            dtm.addColumn("END DATE");
            dtm.addColumn("PERIOD");
            
            /**
             * passing the objects 
             * adding objects to rows
             */
            try{
                   
		while(list.hasNext())
		{
			String name=list.next().toUpperCase();
			String surname=list.next().toUpperCase();
			String gender=list.next().toUpperCase();
                      
                        String sdat =  sdate.toString();
                        String current = curr.toString();
                        String edat =  edate.toString();
                        String period = p1.toString();
                        dtm.addRow(new String[]{name,surname,gender,sdat,edat,current,period});

		}
                return dtm;
                
            }
            catch(Exception e){
                closeFile();
            }
            return null;
           
	}
        
        /**
         * creating default table to 
         * display names of the certificates
         * create local times 
         * @return 
         */
        public DefaultTableModel certs()
        {
            openFile();
            DefaultTableModel cert = new DefaultTableModel();
            LocalDateTime expirydate = LocalDateTime.of(2019, Month.OCTOBER, 31, 13, 0);
		
            
            cert.addColumn("CERTIFICATE NAME");
            cert.addColumn("AUTHORIZED BY");
            cert.addColumn("EXPIRY DATE");
            
            try{
                while(list1.hasNext()){
                
                String certname=list1.next().toUpperCase();
                String authorisor=list1.next().toUpperCase();
                String expire=expirydate.toString();
                
                cert.addRow(new String[]{certname,authorisor,expire});
                
                
                
                }
            
            return cert;
            
            
            }catch(Exception e){
            
            }
            
        
         return cert;
        
        }
        
        /**
         * creating Default table to show date printed
         * @return 
         */
        public  DefaultTableModel print()
        {
        DefaultTableModel dtmprint= new DefaultTableModel();
        
        String dtf = DateTimeFormatter.ISO_DATE.format(ZonedDateTime.now());
        dtmprint.addColumn("DATE PRINTED");
        try{
            
            dtmprint.addRow(new String []{dtf});
            
        }catch(Exception e){
        }
        
        
         
        return dtmprint;
        } 
      
        
     /**
      * closing text files
      */
	public void closeFile(){
		list.close();
	}
}
