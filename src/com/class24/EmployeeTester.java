package com.class24;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.salary=10000;
        employee.getPaid();
        Contractor contractor=new Contractor();
        contractor.salary=50;
        contractor.getPaid();
        System.out.println("=====================================================================");
        //widening
        double var1=10;
        System.out.println(var1);//10.0
      int var2=(int)10.0;
        System.out.println(var2);
      //widening upcasting
        Employee contract2=new Contractor();
        //narrowing down casting
       // Contractor contractor3=(Contractor) new Employee();

    }
}
