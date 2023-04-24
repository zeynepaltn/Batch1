package day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Ask user to enter a 5 digit number, write a code which add the first two and last two digits
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a 5 digit number");
        int number=input.nextInt();
        //%==.modulus operator gives the remainder of two numbers when they divided
        //thereby %10 always gives us ones value of a number
        //if you divide a whole number by another whole number, java gives the result
        //as another whole number it does not give the decimal part
        int lastDigit=number%10;
        number=number/10; //making number smaller
        int lastSecondDigit=number%10;
        number=number/10;
        int lastThirdDigit=number%10;
        number=number/10;
        int lastFourthDigit=number%10;
        number=number/10;
        int lastFifthDigit=number%10;

        System.out.println(lastDigit+lastSecondDigit+lastFourthDigit+lastFifthDigit);






    }
}
