package com.company;
import java.util.*;

class Tester {

    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);
        System.out.println("Enter an integer.");
        String integer = kbInput.next();
        do {
            try {
                if (Integer.parseInt(integer) )
                }
            }catch(Exception e){
                System.out.println("That is not an integer! Pick any whole number to proceed.");
                firstNum = kbInput.next();
            }
        } while (firstNumInt < 1 || firstNumInt > 10);

    }
}
