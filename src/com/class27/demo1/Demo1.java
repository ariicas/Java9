package com.class27.demo1;

public class Demo1 {

}

abstract class Phone {
    void makeCalls() {
        System.out.println("Calling");
    }
    void sendText(){
        System.out.println("Sending text");
    }
  abstract void displayPictures ();
    abstract void unlockPhone();
}

class Iphone extends Phone{

    @Override
    void displayPictures() {
        System.out.println("Iphone uses photos app to display pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("Iphone users can unlock the phone by faceID");
    }
}

class Samsung extends Phone {
    @Override
    void makeCalls() {
        System.out.println("calling from Samsung");
    }

    @Override
    void unlockPhone() {
        System.out.println("can unlock both with facid and fingerprint");
    }

    @Override
    void displayPictures() {
        System.out.println("Use the Gallery app to display pictures ");
    }
}