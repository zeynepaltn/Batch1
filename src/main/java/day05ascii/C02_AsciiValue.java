package day05ascii;

public class C02_AsciiValue {
    public static void main(String[] args) {
        //'A' find the ascii code for the given character
        //if you use char data type in  maths operations in java, it takes values from ascii table
/*
numeric data types:byte-short-int-long-float-double
boolean numeric olmayan data type dir
char karakteri hem sayisal hem resim deger barindirir

 */
        int asciiA='A';
        System.out.println(asciiA);
        int asciia='a';
        System.out.println(asciia);
        int asciiUnlem='!';
        System.out.println(asciiUnlem);
        int asciiSpace=' ';
        System.out.println("asciiSpace = " + asciiSpace);
        int asciiSymbol='*';
        System.out.println("asciiSymbol = " + asciiSymbol);
        char symbol='*';
        char ch='z';
        char isaret='?';
        char space=' ';
        int deger=20;
        char smbl='$';
        System.out.println(deger+smbl);
        int deger2=0;
        char smbl2='+';
        System.out.println("deger2+smbl2 is "+deger2+smbl2);
        System.out.println("deger2 +smbl2 is  = "+(deger2 + smbl2));
        String name="123";
        int num=45;
        System.out.println(name+num);// concatination yanyana yazdirma olur string ve + baska bir numerical data type olunca
        String str1="guzel";
        String str2="cirkin";
        int num2=3;
        System.out.println(str1+str2+num2);
        char rakam1='1';
        System.out.println(rakam1);
        char rakam2='2';
        System.out.println(rakam2);
        char rakam3='3';
        System.out.println(rakam3);
        char rakam4='4';
        System.out.println(rakam4);
        System.out.println("rakam1+rakam2+rakam3+rakam4= "+rakam1+rakam2+rakam3+rakam4);
        System.out.println("rakam1+rakam2+rakam3+rakam4= "+(rakam1+rakam2+rakam3+rakam4));
        //Ascii degerler kullanilarak neler yapilabilir
        byte b=5;
        char ch2='h';
        System.out.println("b>ch2= "+(b>ch2));
        int asciih='h';
        System.out.println(asciih);
        int ascii5='5';
        System.out.println(ascii5);
        long l=542168784578L;
        System.out.println("ch2>l :"+(ch2>l));
        float f=2.45648f;
        double d=2.19658;
        System.out.println("f>d :"+(f>d));
        System.out.println("b>f "+(b>f));
        int sayint=100;
        long saylong=100L;
        System.out.println("saylong==sayint " + (sayint==saylong));

    }//main
}//class
