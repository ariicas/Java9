package com.class23;

public class Degree {

    void getPrerequisite() {
        System.out.println("to get a degree you need a high school diploma");
    }
}

class Bachelor extends Degree {

}

class Master extends Degree {

    void getPrerequisite() {
       System.out.println("to get a master you need a bacherlor degree and highschool diploma");
    }

    public static void main(String[] args) {
        Degree degree= new Degree();
        degree.getPrerequisite();
        Bachelor bach= new Bachelor();
        bach.getPrerequisite();
        Master master= new Master();
        master.getPrerequisite();
    }
}