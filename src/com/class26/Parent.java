package com.class26;

public class Parent {

  final   void method1(){
        System.out.println("no child is allowed to change me ");
    }

}

class Child extends Parent{
   // @Override
  //  void method1() {
    //    System.out.println("from child class");
    //}'// ce error can not override a final but  we can overloaded
}
