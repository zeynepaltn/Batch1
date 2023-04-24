package day05ascii;

public class C03_TypeCasting {
    public static void main(String[] args) {
       /*
       numeric data type larin birbirine donusturulmesine type casting denir
      kucuk data typ dan buyuge donusturulmesine auto widening
      buyuk data type dan kucuge donusturulmesinde java sorumlulugu kabul etmez
      data kaybi olabilecegi icin kodu yazana birakir buna explicit narrowing denir
        */
        byte age=13;
        int ageInt=age;// auto widening
        //now convert long data type to short data type
        long population=1234;
        short newPopulation= (short) population;//explicit narrowing
        int height=170;
        float heightFloat=height;


    }//main
}//class
