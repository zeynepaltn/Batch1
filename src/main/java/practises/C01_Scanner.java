package practises;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
      /* Kullanicidan aldiginiz bir sekil ile asagaidaki sekli olusturan
      kodu yazin
             A
            A A
           A A A
    */

        Scanner input=new Scanner(System.in);
        System.out.println("Please  enter a character");
        char ch=input.next().charAt(0);//charAt(0) ile ize verilen 0 indeksli karakteri aliyoruz
        System.out.println("  "+ch);
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);
    //Example 2:Kullanican iki sayi alan ve 4 islem yapan basit bir hesap makinasi kodu yazin
        System.out.println("Please enter two integers");
    double a= input.nextDouble();
    double b= input.nextDouble();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    //Example 3:Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki rakamlari toplamini vulan kodu yazin
        //1. Yol
        System.out.println("Please enter a 5 digit number");
        int num= input.nextInt();
        int ilkIkiRkm=num/1000; //burada 12 sayisini elde ettim
        int ilkIkiToplam=(ilkIkiRkm%10)+(ilkIkiRkm/10); //%10 kalani yani 2 yi verecek  /10 da 1 i verecek
        int sonIkiRkm=num%100; //5 basamakli sayi oldugu icin kalani verir yani son iki basamagi
        int sonIkiRkmToplam=(sonIkiRkm%10)+(sonIkiRkm/10);
        int toplam=ilkIkiToplam+sonIkiRkmToplam;
        System.out.println(toplam);







    }//main
}//class
