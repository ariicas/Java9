package com.class24;

public class CarTester {
    public static void main(String[] args) {
        //ex of widening
        //a bmw is a car.
        Car bmw=new BMW();
        bmw.start();//method from chill will be called bc we have overwritten.
        bmw.stop();//method from parent will be called bc we have not overwritten.
       // bmw.drifting();//CE NOT ALLOWED

        //if you trying to store a childclasso bject in a parten type variable
        //overiden behavior if not overidden then parent class will be execute
        //if you are tryin to store a child class object in parent you wont be
        //able to exectue specific class behavior.
        //DOWNCASTINHG

        BMW bmw1= (BMW)bmw;//bc now we have converted our reference back to BMW
        bmw1.drifting();

        // we cant do this because not all cars are BMW
        Car car=new Tesla();
        //BMW bmw2=(BMW)car;
        //(BMW) Specificng the type of car.
        //1.
    }

}
