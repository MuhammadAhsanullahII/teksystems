package com.teksystems.sdet.userInput;

import java.util.Scanner;
import javax.swing.JOptionPane;

import org.testng.TestNG;

import com.teksystems.sdet.restapi.ApiTest;
import com.teksystems.sdet.restapi.ParseApi;

public class UserInput extends ParseApi{
	
	
	public  void getCapital_fromName(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Country name");
		String s = "";
		int count = 1;
		
		while (scan.hasNextLine()){
	        s = scan.nextLine();
	        if(s.equals("exit")){
	        	scan.close();
	        	break;
	        }
	        else{
	        	 if(s.equals("") || s.equals(null) || s.length()<=4){
	        		 System.out.println("Three wrong input will exit the application. Total tried " + count  );
					 if(!(count==3)){
						 count++;
						 continue;
					 }
					 else{
				        	scan.close();
				        	break;
				        }
	 			}
	        	 else {
	        		 capitalFrom_CountryName(s);
	        		 
	        	 } 
	        }       
		}
	}
	
	public void getCapital_fromCode(){
		
		String code = "";
		
		int count = 1; 
		while (!code.equalsIgnoreCase("exit")){
			code = JOptionPane.showInputDialog("Please enter country code");
			if(count!=3){
				if(code.equals("") || code.equals(null) || code.length()<2){
					JOptionPane.showMessageDialog(null, "Please enter a valid country code\nThree wrong input will exit the application. Total tried " + count);
				}
		  	}
			else {
			 	break;
		 	}

			JOptionPane.showMessageDialog(null, capitalFrom_CountryCode(code));
			
		    count++;
		}
	}
	
	
}
