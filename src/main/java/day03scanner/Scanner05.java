package day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //ask user to enter length and width of a rectangle to calculate area and perimeter
        System.out.println("Please enter the length and width of the rectangle");
        double length=input.nextDouble();
        double width=input.nextDouble();
        System.out.println("The area of the rectangle is "+length*width);
        System.out.println("The perimeter of the rectangle is "+(2*length+2*width));
    }
}
