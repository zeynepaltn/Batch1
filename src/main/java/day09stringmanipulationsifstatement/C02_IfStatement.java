package day09stringmanipulationsifstatement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
        //USA DE QA INTERVIEW DE SORULMUS BIR SORU
        //Bir String deki tekrarsiz karakterleri ekrana yazdiriniz
        //String y="abbccdc" soru da verilen orjinal string bu
        String y="abbccdc";// ekranda c gostermem lazim tekrari olmayan karakter c dir

        char ch=y.charAt(0);
        if(y.indexOf(ch)==y.lastIndexOf(ch)){
            //body of if statement
            System.out.println(ch);
        }
        char ch1=y.charAt(1);
        if(y.indexOf(ch1)==y.lastIndexOf(ch1)){
            System.out.println(ch1);
        }
        char ch2=y.charAt(2);
        if(y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);
        }
        char ch3=y.charAt(3);
        if(y.indexOf(ch3)==y.lastIndexOf(ch3)){
            System.out.println(ch3);
        }
        char ch4=y.charAt(4);
        if(y.indexOf(ch4)==y.lastIndexOf(ch4)){
            System.out.println(ch4);
        }
        char ch5=y.charAt(5);
        if(y.indexOf(ch5)==y.lastIndexOf(ch5)){
            System.out.println(ch5);
        }
        char ch6=y.charAt(6);
        if(y.indexOf(ch6)==y.lastIndexOf(ch6)){
            System.out.println(ch6);
        }
        //Example: verilen sayi pozitif ise ekrana sayi pozitif yazdiran kodu yaziniz
        int num=65;
        if(num>0){
            System.out.println("sayi pozitif");
        }
        //ex: sayi -1 ile 10 arasinda ise ekrana verilen data rakamdir yazdirin
        int rakam=33;
        if(rakam>-1&&rakam<10){
            System.out.println("verilen data bir rakamdir");
        }
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=input.nextInt();
        if(number>-1 && number<10){
            System.out.println("number is between 1 and 10");
        }
        //Ex: sayi 3 basamakli ise"verilen data 3 basamaklidir" kodu yazin
        Scanner input1=new Scanner(System.in);
        System.out.println("Please enter a  number");
        int number1=input1.nextInt();
        number1=Math.abs(number1);//mutlak deger alip negatiften kurtarir
        if(number1>99&&number1<1000){
            System.out.println("verilen data 3 basamaklidir");
        }

    }//main
}//class
