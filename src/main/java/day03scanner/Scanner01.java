package day03scanner;

import java.util.Scanner;//import scanner from java's util library

public class Scanner01 {
    public static void main(String[] args) {
        //1) create an object with scanner class
        //we named the object input as we're going to enter data externally
        Scanner input = new Scanner(System.in);
        //2) Give instruction to user about what is needed
        System.out.println("Please enter your age");
       byte age=input.nextByte();
        System.out.println(age);
    }
}
