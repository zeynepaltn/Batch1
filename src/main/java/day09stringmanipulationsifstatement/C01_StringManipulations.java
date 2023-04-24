package day09stringmanipulationsifstatement;

public class C01_StringManipulations {
    public static void main(String[] args) {
        //************isEmpty()**********\\
        //bu method bos mu dolu mu diye bakar,boolean bir deger dondurur
        //Ex: Bir stringin hic karakter icermedigini gosteren kodu yazininz
        String str="";
        //1. Yol length methodu ile
        boolean bosmu=str.length()==0;
        System.out.println("bosmu = " + bosmu);
        //2.Yol
        boolean bosmu2=str.isEmpty();
        System.out.println("bosmu2 = " + bosmu2);
        //bir string in bosluk haric hic bir karakter icermedigini kontrol eden kodu yaziniz
        String str2="  ";
        //1. Yol
        boolean result=str2.replace(" ","").length()==0;
        System.out.println("result = " + result);
//2. Yol
        boolean result2=str2.replace(" ","").length()==0;
        System.out.println("result2 = " + result2);
        //bir string de yildiz haric hic karakter olmadigini kontrol eden kodu yaz
        String str3="*";
        boolean rslt=str3.replace("*","").length()==0;
        System.out.println("rslt = " + rslt);
        boolean rslt2=str3.replace("*","").isEmpty();
        System.out.println("rslt2 = " + rslt2);
        //3. yol
        boolean rslt3=str2.isBlank();
        System.out.println("rslt3 = " + rslt3);//true, as it doesn't count the space
        boolean rslt4=str2.isEmpty();
        System.out.println("rslt4 = " + rslt4);// false, as it counts the space
        //*********isBlank***********\\
        /*
        string bir data da space + hiclik icin true dondurur
        string data nin bos mu dolu mu oldugunu kabul eder,boolean deger dondurur
        isEmpty den farki variable imizda sadece bosluk varsa, bos mu dolu mmu diye soruldugunda
        isBlank bos der, isEmpty ise karakter yerine koyar space i ve bos degil der
         */
        //********indexOf**************\\
        /*
        indexOf metodu verilen karakterlerin il gorunumunun indexini verir
        tekli karakter icinde coklu karakter icinde kullanilabilir
         */
        //example: bir string de a,i,e karakterleinin ilk gorunumlerinin indexleri toplamini ekrana yazdiein
        String r="Java is easy to Learn";
        int aindex=r.indexOf('a');
        System.out.println("aindex = " + aindex);//1
        int iindex=r.indexOf('i');
        System.out.println("iindex = " + iindex);//5 j=0,a=1,v=2,=3,space=4 so i=5
        int eindex=r.indexOf('e');
        System.out.println("eindex = " + eindex);
        System.out.println("a index b index c index ="+(aindex+iindex+eindex));
        //ex:Bir string de java kelimesinin ilk olaarak kacinci index de kullanildigini gosteren kodu yazininz
        String u="Ah Java vah Java sen ne guzel seysin Java";
        int indexjava=u.indexOf("Java");
        System.out.println("indexjava = " + indexjava);//java nin j si 3. index te oldugu icin 3 cevap olur
        //olmayan bir datanin sonucunu bize -1 dondurur
        int indexjava1=u.indexOf("python");
        System.out.println("indexjava1 = " + indexjava1);
        //***********lastIndexOf()*************\\
        /*
        verilen bir data da karakter ya da karakterlein
        son gorunumunun indexini verir
         */
        //Ex: bir string de a,,e,i karakterleinin son gorunumlerinin toplamini yazin
        String v="Java is easy to Learn";
        int alastindex=v.lastIndexOf('a');
        System.out.println("alastindex = " + alastindex);
        int elastindex=v.lastIndexOf('e');
        System.out.println("elastindex = " + elastindex);
        int ilastindex=v.lastIndexOf('i');
        System.out.println("ilastindex = " + ilastindex);
        System.out.println("a last e last i last ="+(alastindex+elastindex+ilastindex));


    }//main
}//class
