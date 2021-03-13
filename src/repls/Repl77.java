package repls;

import java.util.Scanner;

public class Repl77 {

	public static void main(String[] args) {
            
		// Create an array of integers that will store 5 elements taken from a user

		//Don't print any prompt message for the user

		//Then print out all the elements you have created in the first loop in reverse order
		   
	     int j=0;
	        Scanner s = new Scanner(System.in);
	      
	        int num[] = new int[5];
	        int rev[] = new int[5];
	       
	        for(int  i=0; i <num.length; i++)
	        {
	            num[i] = s.nextInt();
	        }
	        
	        for(int i=num.length;i>0 ; i--,j++)
	        {
	            rev[j] = num[i-1];
	            System.out.println(rev[j]);
	        }
	       

	         
	}

}
