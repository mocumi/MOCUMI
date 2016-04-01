/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GURUS;
/**
 * import all required classes
 */
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;
import java.time.LocalTime;
// 
/** 
 *
 * @author MOCUMI
 */
public class list
{
   public void Arrlist()
   {
       String name="";
       /**
        * Creating and declaring ArrayList, ListIterator
        * String Builder 
        * Manipulating string using substring and trim
        * LocalTime 
        */
       LocalTime lt = LocalTime.now();
       ArrayList<String> myArrList = new ArrayList();
        myArrList.add("VALDY WALTERS\nENNERDALE");
        myArrList.add("THULISILE THUKWANA\nCAPE TOWN ");
        myArrList.add("DENNIS SHABANO\nSASOL BRT");
        myArrList.add("MARCUS TEMA\nNORTHCLIFF HEAD OFFICE");
        StringBuilder str = new StringBuilder("TSCJUMPCO FACILTATORS ");
        String s = new String(str.substring(3));
        
        name=name + str.substring(0,9);
        
        ListIterator<String> iterator = myArrList.listIterator();
        while (iterator.hasNext()) {
      
        JOptionPane.showMessageDialog(null, iterator.next(),s.trim() , JOptionPane.INFORMATION_MESSAGE);
        
        }
        JOptionPane.showMessageDialog(null,"JUMPCO",name,JOptionPane.INFORMATION_MESSAGE); 
        // JOptionPane.showMessageDialog(null,"DATE VIEWED",lt,JOptionPane.INFORMATION_MESSAGE);
         JOptionPane.showMessageDialog(null,lt);
   }
   
   
   
}
   

