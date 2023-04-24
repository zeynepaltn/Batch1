package day06typecastingstringmanipulation;

public class C01_StringManipulation {
    public static void main(String[] args) {
        String a="tek Rakibim Dunku Ben";
        String aUpper=a.toUpperCase();//buyuk harfe cevirir
        System.out.println("aUpper = " + aUpper);
        String alower=a.toLowerCase();
        System.out.println("alower = " + alower);//kucuk harfe cevirir hepsini
        System.out.println(a.charAt(0));//gives you the first letter
        //the first letter starts from 0 and the second letter is 1 and so on...
        System.out.println(a.charAt(9));//gives the letter in the 10 th position
        //bastan ve sontan ikinci karakteri print et
        System.out.print(a.charAt(1));
        System.out.println(a.charAt(19));
        System.out.println(a.length());//tells how many characters are there in the sentence
        //now lets look at substring
        System.out.println(a.substring(0,4));//takes first 4 characters in the sentence


    }//main
}//class
