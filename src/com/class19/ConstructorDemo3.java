package com.class19;

public class ConstructorDemo3 {
	//this are instance variables;
	String name;
	double salary;
	double bonus;
	int numberOfDaysWorked;
	double bonusPercentage;
	
	//belows is constructor;
	ConstructorDemo3(String name1, double salary, int numberOfDaysWorked,double bonusPercentage){
		name=name1; //.this is to identify instance to //local variables
		this.salary=salary;
		this.bonus=1000;
		this.numberOfDaysWorked=numberOfDaysWorked;
		this.bonusPercentage=bonusPercentage;
		
	}	
	
	void printBonus() {//no local variable with the same name thats whyNumberofday is blue;
		
		if (numberOfDaysWorked>300) {
			bonus=1000;
		}else {
			bonus=500;
		}
		
		
	}
	
	
	public static void main(String[] args) {      //it belongs to above inside parantheses.
		ConstructorDemo3 ramObj =new ConstructorDemo3("Ram",100000,250,21);
		System.out.println(ramObj.name);
		System.out.println((int)ramObj.salary);
		System.out.println((int)ramObj.bonus);
		System.out.println(ramObj.numberOfDaysWorked);
		System.out.println(ramObj.bonusPercentage);
		ramObj.printBonus();
	}

}
