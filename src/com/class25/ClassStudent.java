package com.class25;

public class ClassStudent {

    void study() {
        System.out.println("Students must study");
    }
    void doHomeWork(){
        System.out.println("Students must do homework");
    }
    void practice(){
        System.out.println("Students must practice ");
    }
}

class SyntaxStudent extends ClassStudent {
    void doHomework(){
        System.out.println("Syntax students must do homework to succeed and get a job");
    }
    void practice (){
        System.out.println("Syntax student must practice additional 15 to 20 hours");
    }
    void doResearch() {
        System.out.println("Syntax students must do their own research");
    }

}

class CollegeStudent extends ClassStudent {
    void doHomework(){
        System.out.println("College student must do homework to get good grades");
    }
}

class SchoolStudent extends ClassStudent {

}