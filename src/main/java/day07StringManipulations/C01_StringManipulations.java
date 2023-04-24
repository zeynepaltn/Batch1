package day07StringManipulations;

import java.sql.SQLOutput;

public class C01_StringManipulations {
    public static void main(String[] args) {
        String s="Learn Java Earn Money";
        //how the control if the s string ends with the word "money"
        boolean isEnd=s.endsWith("Money");
        System.out.println("does it end with money "+isEnd);
        String s2="Learn money Java earn";
        boolean iceriyorMu=s2.contains("money");
        System.out.println("icinde mi " +iceriyorMu);
        String s1=s.replace("Money","dollar");
        System.out.println(s1);
//asagidaki ornekler kelimeleri  baska kelimelerle degistirmek icin
        String s3=s.replace("earn","win");
        System.out.println(s3);
        String s4=s.replace('a','*');
        System.out.println(s4);
        //mesela e harflerini nasil sileriz
       String s5 =s.replace("e","");
        System.out.println(s5);
        String s6=s.replace('e',' ');//space de bir karakterdir ve java da bir anlami vardir e harfi boslukla degisir
        System.out.println(s6);
        String s7=s.replace("earn","");
        System.out.println(s7);
        //t stringindeki kalem keslimesi yerine biber yerlestiriniz
        String t="Dolma Kalem";
        String t1=t.replace("Kalem","Biber");
        System.out.println(t1);



    }//main
}//class
