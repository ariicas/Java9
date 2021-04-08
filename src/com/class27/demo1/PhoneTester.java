package com.class27.demo1;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iphone= new Iphone();
        iphone.unlockPhone();
        Phone samsungPhone=new Iphone();
        samsungPhone.displayPictures();
        samsungPhone.makeCalls();

       // Phone phone=new Phone();// not allowed to create and object from
      //  abstract classes bc the classes are imcompleted not implemented.
    }
}
