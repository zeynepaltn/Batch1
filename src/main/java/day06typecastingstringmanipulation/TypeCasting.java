package day06typecastingstringmanipulation;

public class TypeCasting {
    public static void main(String[] args) {
       short num=260;
       byte numbyte= (byte) num;
        System.out.println("numbyte= "+numbyte);
        short num2=1023;
        byte num2byte= (byte) num2;
        System.out.println("num2byte is "+num2byte);
        short num3=1000;
        byte num3byte= (byte) num3;
        System.out.println("num3byte = " + num3byte);
        int intsayi=8880;
        short shortSayi= (short) intsayi;
        System.out.println("shortSayi = " + shortSayi);
        /*
        explicit narrowing yaparken data kaybina ugrayacagimiz icin cok dikkatli olunmali
         */

    }//main
}//class
