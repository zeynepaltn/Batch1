package day08stringmanipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {
        //***********replaceFirst() methodu nedir
        /*
        replaceFirst(): replace() ile ayni isi yapmakla birlikte
        ilk gordugu detayi degistirir
         */
        String str="Bizimle Java Ogrenmek Cok Kolay";
        // str de "a" yerine "e" harfi yerlestirin
        String str1=str.replaceFirst("i","e");
        System.out.println(str1);//sadece first i e olur
        String str2=str.replace("i","e");
        System.out.println(str2);//butun i ler e olur
        //*******trim() methodu nedir
        /*
        bastaki ve sondaki space karakterleri siler
        ortadaki space karakterlere dokunmaz
         */
        System.out.println("*******************");
        String isim="   Rukiye Neva Altun ";
        String isim1=isim.trim();
        System.out.println(isim1);
        //asagida verilen urunlerin toplam fiyatini bulunuz
        //String tv="599.99 " String laptop="299.99"
        //birinci method
        String tv="599.99$";
        String laptop="299.99$";
        String tv2=tv.replace("$","");//599.99 hala string konteynirinda ve bu sekilde islem yapamayiz
        String laptop2=laptop.replace("$",""); //299.99 hala string
        Double totalPrice=Double.valueOf(tv2)+Double.valueOf(laptop2);
        System.out.println("total price is "+totalPrice+"$");
        //valueof() string olan bir datayi sayisal bir degere cevirir boylece islem yapabiliriz

        //ikinci method
        double tv1=599.99;
        double laptop1=299.99;
        double sum=tv1+laptop1;
        System.out.println("toplam fiyat "+sum+"$");
        //verilen stringdeki ilk ismin ilk harfiyle son ismin ilk harfini buyuk yapin==>MF
        String tamIsim="  mehmet fatih  ";
        String trimisim=tamIsim.trim();
        char ilkharf=trimisim.toUpperCase().charAt(0);
        char sonharf=trimisim.toUpperCase().charAt(7);
        System.out.println("tam isim: "+ilkharf+sonharf);
        // ikinci method
        char first=tamIsim.trim().toUpperCase().charAt(0);
        char second= tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("first and second is "+first + second);

    }//main
}//class
