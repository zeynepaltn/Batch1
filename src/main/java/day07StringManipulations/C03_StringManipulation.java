package day07StringManipulations;

import java.util.Scanner;

public class C03_StringManipulation {
    public static void main(String[] args) {
        /*
Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz

        i) En az 8 karakterden olussun
        ii)Password space icermesin
        iii)En az 1 tane buyuk harf olsun
        iv) En az 1 tane kucuk harf olsun
        v) En az 1 tane sembol olsun
        vi) En az 1 tanede rakam olsun

         */
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen passwordunuzu girin");
        String pwd=input.nextLine();
        //en az 8 karakter
        //boolean first=pwd.length()>=8; bu da olur ama iki islem var hem esittir hem buyuktur
        boolean first=pwd.length()>7;
        //space icermesin
        boolean second=!pwd.contains(" "); //! k space icermesin demek
        //en az bir buyuk harf
        boolean third=pwd.replaceAll("[^A-Z]","").length()>0;
        //en az bir kucuk  harf olsun
        boolean fourth=pwd.replaceAll("[^a-z]","").length()>0;
        //en az bir tane sembol olsun
        boolean fifth=pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        //en az bir tane rakam olsun
        boolean sixth=pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println(first && second && third && fourth && fifth && sixth);



    }//main
}//class
