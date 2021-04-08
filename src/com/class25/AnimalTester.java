package com.class25;

public class AnimalTester {
    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.eat();
        animal.sleep();
       // animal.bark(); no place to hold
        Cat cat=(Cat) animal;
        cat.speak();
    }


}
