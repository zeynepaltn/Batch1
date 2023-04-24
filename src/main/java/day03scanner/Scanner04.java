package day03scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Ask user to enter two numbers and apply four operations on the number and reflect the result on the screen
        System.out.println("Please enter two different numbers");
        double firstNumber=input.nextDouble();
        double secondNumber=input.nextDouble();
        System.out.println(firstNumber+secondNumber);
        System.out.println(firstNumber-secondNumber);
        System.out.println(firstNumber*secondNumber);
        System.out.println(firstNumber/secondNumber);

    }
}
