package day05ascii;

public class C01_MatematikselIslemler {
    public static void main(String[] args) {
        /*
        In java when you perform operations with different types of data
        the result is going to be in the data type that is bigger than the other one.
        karsilastimra yapan operatorlerde sonuc he zaman boolean dir
         */
        System.out.println(4*(5+2)/3);// The result is 9 as int/int=int in java
        System.out.println(6*16/8); //12
        double result=4*(2+5)/3;// the result is 9.0
        System.out.println("the result is "+ result);
        double result2=4.0*(2+5)/3;
        System.out.println("the result2 is "+result2); //the result is 9.333333334
        // when performing operations with different dta types java always take the big data type as it's result
        System.out.println(4*(1+5)/3);
        int num1=5;
        int num2=2;
        double num3=2;

        System.out.println(num1/num2);
        System.out.println(num1/num3);
        System.out.println(num1+num3/num2);
        boolean first=2<4;
        boolean second=2+6!=8;
        boolean third=2+3*5<20;
        System.out.println("first = " + first);
        System.out.println("second = " + second);
        System.out.println("third = " + third);
        System.out.println(first && second);
        System.out.println(first||second||third);


    }//main
}//class
