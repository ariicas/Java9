package com.class24;

public class Employee {
    double salary;
    void work (){
        System.out.println("Employee is working");
    }
    void getPaid() {
        System.out.println("Employee is getting paid"+salary+" other benefits");
    }
    void goOnLeaves(){
        System.out.println("Employee is going on leaves");
    }
}

class fullTimeEmp extends Employee {

}

class partTimeEmp extends Employee {
    @Override
    void goOnLeaves() {
       System.out.println("Part time employee dont gets leaves");
    }
}

class Contractor extends Employee {
    @Override
    void goOnLeaves() {
        System.out.println("Contractor employee dont gets leaves");
    }

    @Override
    void getPaid() {
        System.out.println("paid on hourly basis "+salary);
    }
}