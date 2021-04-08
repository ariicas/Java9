package com.class23;

public class Test {
    public static void main(String[] args) {
        System.out.println("main method from Parent");
    }
}

class Child1 extends Test {
   // public static void main(String[] args) {
     //   System.out.println("main method from Child");
  //  }
}

class Child2 extends Test {
    public static void main(String[] args) {
        String [] args1={"hi"};
        Child1.main(args1);
    }
}