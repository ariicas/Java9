package com.class04;


import java.util.Scanner;

public class Hw04Pt02 {

	public static void main(String[] args) {
		
		//Exercise #4 
		Scanner input=new Scanner(System.in);
		System.out.println("Hello, Welcome to BOA! Do you have a credit card?");
		
		String card=input.nextLine();
		
		String num1="Yes";
		String num2="No";
		
		if (card.equals(num1)){
			System.out.println("What is the balance on your card?");
			double amount=input.nextDouble();
			if (amount>1000) {
			System.out.println("You should pay off your balance!!!");
			}else {
				System.out.println("Well, then you can spend more and go shopping!!");
			}
				
			
			
		}else {
			System.out.println("Would you be interested in opening an account?");
			
			String answer=input.nextLine();
			
			String str1="Yes";
			String  str2="No";
			if (answer.equalsIgnoreCase(str1)) {
				System.out.println("I will help you!");
			}else {
				System.out.println("Okay, have a nice day!");
			}
			
		System.out.println("--------------------------------------------------------------------------");
		
		//Exercise #5
		
		Scanner info=new Scanner(System.in);
		System.out.println("How long have you been working here?");
		 int years=info.nextInt();
		 
		 System.out.println("What is your annual salary?");
		 
		 int salary=info.nextInt();
		 if (years>=5) {
			 System.out.println("You are egible for a BONUS!");
			 if (salary>=50000) {
				 System.out.println("You will receive a Bonus of 5000");
			 }else {
				 System.out.println("and you will receive a Bonus of 3000");
			 }
		 }else {
			 System.out.println("Im sorry but you are not qualify for a bonus");
		 }
		 
		 
	
		}
		
		
		
		}

}
