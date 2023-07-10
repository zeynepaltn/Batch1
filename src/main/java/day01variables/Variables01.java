package day01variables;

public class Variables01 {
    public static void main (String[] args) {
        //java doesn't read this line
        /*
        java doesn't read this paragraph

         */
        //creating variables
        //you have to tell the data type+name the variable+assign an operator+data;
              int                        age               =                    13;
  //if you declare a variable and do not assign anything java will assign its own values
        //(default==>assumed)
        //default values for numbers are zero
        //==means equal in java
        //data type+variable name== variable declaration
        //assignment operator+ value of variable==>assignment
        /*
        There are two types of data in java. These are
        1)primitive data type;char,boolean,byte,short,int,long,float,double
        2)non-primitive data type

         */
        //String example
        String studentName="Ali can" ;
        //String values are always written in double quotation marks
        //String default value is null
      //  char data type is used for sole characters==. A,x,7,5
        char firstLetterName='A' ;
        //boolean data type: true or false data type
        //example for boolean data type
        boolean areYouRetired= false;
        //byte data type is for whole numbers it takes 1 byte space
        //byte uses all the values between -128 and +127
        byte studentAge=15 ;
        //short data type is also for whole numbers it takes 2 bytes space
        //takes all the values between-32768 and 32767
        short populationOfSite= 750;
        // int data type is also for whole numbers, takes 4 bytes space in the memory
        //int uses all the values between -2147483648 and 2147483647
        int populationOfTurkey= 85000000;
        //long is also for whole numbers, and it takes 8 bytes of space
        //it takes all values between -9223372036854775808 and 9223372036854775807
        //If a value is a long you must add L at the end of the value
        long noOfCells= 29876151451L;
        //float data type is used for decimal numbers, use F at the end of the value
        //It takes 4 bytes space in the memory
        //Java accepts decimals numbers as double
        float shirtPrice=12.99F;
        float shoePrice=15.99F;
        System.out.println(shirtPrice+shoePrice);
        //System.out.println() shortcut is ==>sout+enter
        int a=12;
        int b=13;
        System.out.print(a);
        System.out.println(b);
        //System.out.println(); leaves a line and then prints
        //System.out.print(); prints in the same line
        //double data uses decimal numbers, after decimal point there are many digits
        double weightCell=0.00000000001122;
        double weightAmip=0.0000000000023;
        System.out.println(weightCell-weightAmip);

        System.out.println("token deneme");







    }
}
