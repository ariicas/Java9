package com.class27.demo2;

public class VehicleTester {
    public static void main(String[] args) {
        BMW bmw= new BMW("12345xml","Sedan","BMW","x5");
        bmw.start();
        bmw.stop();
        bmw.speed();
        bmw.drive();
        bmw.display();

        Vehicle vehicle=new Toyota("12345","SUV","Toyota","rav4");
        //vehicle.display(); we cant call this method bc is not inherited.
        //we cant call methods that are not in the parent class/vehicle
        //anything in the toyota can be call
        vehicle.drive();
        vehicle.start();


        Car car=new Toyota("12345","SUV","Toyota","rav4");
        //can only execute methods inside car class.

        Toyota toyota=new Toyota("12345","SUV","Toyota","rav4");
        toyota.display();
       // everything inside this class plus inherited.

    }
}
