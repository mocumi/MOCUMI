/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;
import java.io.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;


/**
 *
 * @author MOCUMI
 */
public class javagurus
{
    private Scanner list;
	
	public void openFile()
	{
		
		try{
			list=new Scanner(new File ("C:\\Users\\sello daniel\\Documents\\NetBeansProjects\\MOCUMI\\src\\newpackage\\s.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("list doesn't exist");
		}
	}
	
	public DefaultTableModel readFile()
	{
            openFile();
             
            DefaultTableModel dtm = new DefaultTableModel();
            LocalDate sdate= LocalDate.of(2015, 10, 06);
            LocalDate curr= LocalDate.of(2016, 10, 31);
            LocalDate edate= LocalDate.now();
            Period p1 = Period.ofMonths(12);
           
            
            dtm.addColumn("NAME");
            dtm.addColumn("SURNAME");
            dtm.addColumn("GENDER");
            dtm.addColumn("START DATE");
            dtm.addColumn("CURRENT DATE");
            dtm.addColumn("END DATE");
            dtm.addColumn("PERIOD");
            
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
        public void ArrList()
        {
            
        
         
        
        }
        
     
	public void closeFile(){
		list.close();
	}
}
