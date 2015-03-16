/**
 * Name: Adam Cyrkot
 * Student ID: 991-286-168
 * Assignment: Password Validator
 * 
 * Assignment 1 - Test Driven Development Exercise
 *
 * Assumptions: Couldn't figure out the 'atLeastTwoDigits' logic, but overall it's all completed to the best of my abilities
 */

package PasswordValidator;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PasswordValidator {
	
	  static int j, k, m, i, n = 0;
	  static boolean b = true;
	    
	public static void main(String[] args) 
	{
		while (b == true){
		try{
			//Get User input
			Scanner s = new Scanner(System.in);
			System.out.println("Please Enter a Password that: \n"
							 + "- Is at least 8 Characters long, \n"
							 + "- Contains at least 2 numbers. \n");
			
			String input = s.nextLine();
			
			//Process the user input to meet requirements...
			if (atLeastEightChars(input))
			{
				if (onlyLettersAndDigits(input))
				{
					digitCount(input);
					b = false;
				}
				else
					System.out.print("Must input a letter/number combination.");
			}
			else
			{
				System.out.println("The password you've entered doesn't contain at least 8 characters...");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("An unexpected Exception occurred. \n" + e);
			
		}}
	}
	
	//Method that tests user input if it is at least 8 characters long
	public static boolean atLeastEightChars(String in)
	{
		in.length();
		
		if (in.length() >= 8)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	//Method to test whether user input contains at least two numbers
	public static void digitCount(String in)	    
	{
	   	char[] a = new char[in.length()];
	       
	       int[] t = new int[i];
	        
	       System.out.println("");
	        
	       for(j = 0; j < i; j++)
	       {
	           for(k = 0, n = 0; k < in.length(); k++)
	           {
	               if(a[j] == in.charAt(k))
	               n++;
	           }
	           
	           t[j] = n;
	           int counter = 0;
	           
	           if (a[j] >= 48 && a[j] <= 57)
	           {
	           	counter++;
	           	if (counter == 1)
	           	{
	           		System.out.println("GG M8");
	           	}
	           	else if (n == 1)
	           	{
	           		counter++;
	           		System.out.println("Sorry, you need at least 2 numbers in your password.");
	            }
	        }
	    }
	}
	
	//Method for processing input for only alphabet letters and numbers...
	public static boolean onlyLettersAndDigits(String in)
	{
		boolean bool;
		char[] a = new char[in.length()];
	       int[] t = new int[i];
	        
	       System.out.println("");
	        
	       for(j = 0; j < i; j++)
	       {
	           for(k = 0, n = 0; k < in.length(); k++)
	           {
	               if(a[j] == in.charAt(k))
	               n++;
	           }
	           
	           t[j] = n;     
	       }
	       
	       if ((a[j] >= 0 && a[j] <= 47) || (a[j] >= 58 && a[j] <= 64) || (a[j] >= 91 && a[j] <= 96) || (a[j] >= 123 && a[j] <= 127))
           {
        	   bool = false;
           }else
           {
        	   bool = true;
           }
	    return bool;
	}
	
	
	//REFRACTORED METHOD... THIS WAS SUPPOSED TO MAKE SURE THE PASSWORD CONTAINS AT LEAST 2 NUMBERS
	/** public static boolean atLeastTwoDigits(String in)
	{
		Boolean b = false;
		for (int i = 0; i < in.length(); i++)
		{
			if((int)in.charAt(i) >= 48 && (int)in.charAt(i) <= 57)
			{
				b = true;
				
			}
			else
			{
				b = false;
			}
		}
		return b;
	} **/
}