package com.class24;

public class Car {
    String make;
    String model;

    void start() {
        System.out.println("Use the key to start me");
    }
    void stop () {
        System.out.println("use the breaks t stop me");
    }
    void park() {
        System.out.println(" Park me manually");
    }
}

class BMW extends Car {
    void start  () {
        System.out.println("Use the button to start me ");
    }
    void drifting (){
        System.out.println("i can drift really good in rain");
    }
}

class Tesla extends Car {
    void start () {
        System.out.println("Use app to start me ");
    }
    void park () {
        System.out.println("Park me using senos and camera");
    }
}

class Toyota extends Car {

}