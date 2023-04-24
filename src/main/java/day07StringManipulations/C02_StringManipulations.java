package day07StringManipulations;

public class C02_StringManipulations {
    public static void main(String[] args) {
        //bir grup datayi degistirmek icin kullanilir
        //bir grup data=regular expression(Regex) kullanilir
        /*
        en cok kullanilanlar
        1) tum rakamlar==>[0-9]
        2) tum kucuk harfler==>[a-z]
        3)tum buyuk harfler==>[A-Z]
        4) tum harfler==>[a-zA-Z]
        5)tum harfler ve rakamlar==>[a-zA-z0-9]
        6)tum sesli harfler==>[aeiouAEIOU]
        7)tum noktalama isaretleri==> \\p{Punct}
        8) ^ ==>  den farkli, haricinde
        mesela tum rakamlar haricinde demek istersem [^0-9] yazarim

         */
        String s="Mehmet 20 yasinda QA_Developer kursunda $ dolar kazanmistir...";

        //Example s stringindeki tum rakamlari * a cevirin
        String s1=s.replaceAll("[0-9]","*");
        System.out.println(s1);
        //s stringindeki tum harf ve rakamlari @ isaretine cevirin
        String s2=s.replaceAll("[a-zA-Z0-9]","@");
        System.out.println(s2);
        //s Stringde space ler disindaki tum karakterleri +a ceviriniz
        String s3=s.replaceAll("[^ ]","+");
        System.out.println(s3);
        //s stringindeki tum karakterleri, kucuk harfler disinda, yildiza donustur
        String s4=s.replaceAll("[^a-z]","*");
        System.out.println(s4);
        String s5=s.replaceAll("[^aeiouAEIOU]","&");
        System.out.println(s5);

    }//main
}//class
