package com.class26;

public class Task1 {
    final int number;

    Task1(int number) {   //we can only initiliaze final with a constuctor or assinged it right away not in methods.
        this.number = number;

    }   //   void init(int number){
        //  this.number=number; it will us an error
        //     }

        public static void main (String[]args){
           final Task1 var1 = new Task1(10);
        //    var1 = new Task1(20);

            final int[]a={10,20};
            a[1]=30;
        }

}