package com.class23;

public class Parent {

    public void printSomething() {
        System.out.println("parent");
    }
}

class Child extends Parent {


    public void printSomething () {
        System.out.println("child");
    }
public static void main(String []args ) {
        Child child=new Child();
        child.printSomething();
}

}