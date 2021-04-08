package com.class23;

public class Azizi {
    void marry() {
        System.out.println("My boy will marry the girl that me and my wife will choose" +
                "for him ");
    }
}

class Son1 extends Azizi {
// if nothing is here, it will take it from the parent.
}

class Son2  extends Azizi{
    void marry() {
        System.out.println("i want to marry taylor swift");

    }

    public static void main (String[]args) {
        Son1 son1=new Son1();
        son1.marry();
        Son2 son2=new Son2 ();
        son2.marry();

    }
}