package day10StringManipulations;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {
        //if it rains, I will cancel the picnic
        //ex: verilen bir karakteri buyuk harf ise ekrana "buyuk harf" yazdiran kodu yaziniz
        char ch='A';
        if(ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf");
        }
        //ex; verilen say cift ise ekrana cift yazdirin kodu yaziniz
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=input.nextInt();
        if(number%2==0) {
            System.out.println("sayi cift sayidir");
        }
        //verilen bir sayi 300 den kucuk veya 1200 den buyuk ise "harika sayi yazdiran kodu yaziniz
        int num=250;
        if(num<300 || num>1200){
            System.out.println("harika bir sayi");
        }
        //kullanicidan alinan data nin tek mi cift mi oldugunu yazan kodu girin
        Scanner input1=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number1=input1.nextInt();
        if(number1%2==0){
            System.out.println("even number");

        }
        if(number%2==1){
            System.out.println("odd number");
        }
        //2. yol if else
        if(number1%2==0) {
            System.out.println("even number");
        }else{
            System.out.println("tek sayidir");
        }
        //verilen sayinin negatif pozitif veya notr mu oldugunu gosteren kodu yazin
        Scanner input2=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number2=input2.nextInt();
        if(number2<0){
            System.out.println("negatif sayidir");
        }else if(number2==0){
            System.out.println("notr sayi");
        }else{
            System.out.println("pozitif sayidir");
        }


    }//main
}//class
