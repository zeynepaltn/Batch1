package practises;

public class Q04_Hipotenus {
    public static void main (String[] args){
        //write a code which calculates hypotenuse
        System.out.println(hipotenusHesapla(5,12));

    }
    public static double hipotenusHesapla(double dikkenar1,double dikkenar2){
        return Math.sqrt(dikkenar1*dikkenar1+dikkenar2*dikkenar2);

    }
}
