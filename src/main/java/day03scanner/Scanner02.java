package day03scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //Ask the user to enter his/her name and surname
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your name");
        String firstName= input.next();
        System.out.println("Please enter your last name");
        String lastName= input.next();
        System.out.println(firstName+" "+lastName);




    }
}
