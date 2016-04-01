package mocumi.arrays;
//import java.util.Arrays;


import javax.swing.*;

public class Cumisarrays {
	
	//public  CumisArray(){
		
		 
		
	//}
	
	
	
	
	
	

	public static void main(String[] args)
	{
		/*JFrame ccc = new JFrame("Zille");
		JPanel xxx = new JPanel();
		JTextArea a;
		
		
		
		a = new JTextArea(myarr);
		a.setBounds(100,20,400,400);
		xxx.add(a);
		
		xxx.setLayout(null);
		ccc.add(xxx);
		ccc.setSize(800,600);
		ccc.setVisible(true);*/
		
		int [][] myarr = new int [6][5];
		
		myarr[0][0] = 10;		myarr[1][0] = 25;
		myarr[0][1] = 11;		myarr[1][1] = 15;
		myarr[0][2] = 12;		myarr[1][2] = 26;
		myarr[0][3] = 32;		myarr[1][3] = 18;
		myarr[0][4] = 54;		myarr[1][4] = 32;
		
		myarr[2][0] = 21;		myarr[3][0] = 31;
		myarr[2][1] = 22;		myarr[3][1] = 211;
		myarr[2][2] = 23;		myarr[3][2] = 221;
		myarr[2][3] = 24;		myarr[3][3] = 25;
		myarr[2][4] = 25;		myarr[3][4] = 21;
		
		myarr[4][0] = 56;		myarr[5][0] = 2;
		myarr[4][1] = 65;		myarr[5][1] = 34;
		myarr[4][2] = 87;		myarr[5][2] = 4;
		myarr[4][3] = 78;		myarr[5][3] = 5;
		myarr[4][4] = 32;		myarr[5][4] = 0;
		
		
		int rows = 6;
		int columns = 5;
		int i,j;
		
		for (i = 0; i <rows; i++){
			for (j = 0; j < columns; j++ ){
			System.out.print(myarr[i][j]+ "\t");
				//JOptionPane.showMessageDialog(null,myarr[i][j]  , "arrays", JOptionPane.INFORMATION_MESSAGE);
				
			}
			System.out.println("");
			
		}
	
		
		
	}

}
