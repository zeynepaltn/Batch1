package day10StringManipulations;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {
        //kullanici gun ismini girsin kod gunu yazsin
        //1. gun avrupa da pazar gunudur
        Scanner input=new Scanner(System.in);
        System.out.println("enter day number");
        byte gunNo=input.nextByte();
        if(gunNo==1){
            System.out.println("sunday");
        }else if(gunNo==2){
            System.out.println("monday");
            }else if (gunNo == 3){
            System.out.println("tuesday");
        }else if(gunNo==4){
            System.out.println("wednesday");
        }else if(gunNo==5){
            System.out.println("thursday");
        }else if(gunNo==6){
            System.out.println("friday");
        }else{
            System.out.println("saturday");
        }


    }//main
}//class
