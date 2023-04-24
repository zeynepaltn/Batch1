package day03scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your address");
        String address=input.nextLine();  //This is used when there are many words to enter
        System.out.println(address);
    }

}