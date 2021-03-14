package com.class14;

public class MoreMethodExamples {
 /*
  * Create a methods that does not take any values and always 
  * return String Hi
  */
	
	String print() {
		return "hi";
		
	
	}
	/*
	 * create a method that takes a number 
	 * and returns the double of that number
	 */
	
	double doubleTheValue(double input) {
		return input*2;
	}
	
	/*
	 * created a method that will take a boolean as input
	 * if the value is true. i want to say take the umbrella
	 * and if the value false print please go for a walk 
	 */
	
	void isRaining (boolean isRain) {
		if(isRain) {
			System.out.println("Please take the umbrella");
		}else {
			System.out.println("Please go for a walk");
		}
	}	
		/*
		 * create a method to print batch 9 is great 5 times 
		 */
	
				void print5() {
			for(int i=0; i<5; i++) {
			System.out.println("Batch 9 is the greatest");
			}
		}	
					
double returnGreater(double num1 ,double num2) {
	if (num1>num2) {
		return num1;
	}else {
		return num2;
	}
}
/*create a method that takes a number if number 
 * is even print number is even other wise print 
 * number is odd
 */

void numEvenOdd(int a) { 
	if (a%2==0) {
		System.out.println("number is even");
			
		}else {
			System.out.println("number is odd");
		}	
}
/* write a method that takes an array and return the
 * sum of the elements that are present in the array 
 */

double returnTheArraySum(double [] arr) {
	
	double sum=0;
	for (double element:arr) {
		sum=sum+element;
	
	}
	return sum;
}
/*
 * write a method that return true if a string is  
 * mirror of itself otherwise it return false
 * aba yes
 * bba yes
 * bba no
 */

boolean isMirror(String str) {
	String newStr="";
	
	for(int i=str.length()-1; i>=0; i--) {
		System.out.println(i+ " "+str.charAt(i));
	}
	System.out.println(newStr);
	
	if(str.equals(newStr)) {
		return true;
	}else {
		return false;
	}
}

}