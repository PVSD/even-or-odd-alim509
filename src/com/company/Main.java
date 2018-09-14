package com.company;
import java.util.*;

class Tester {

    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);
        System.out.println("Enter an integer.");
        int integer = kbInput.nextInt();
        if (integer % 2 == 0) {
            System.out.println("The integer " + integer + " is even.");
        } else {
            System.out.println("The integer " + integer + " is odd.");
        }

        main(null);

    }

}