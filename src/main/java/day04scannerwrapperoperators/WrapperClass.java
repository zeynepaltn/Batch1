package day04scannerwrapperoperators;

public class WrapperClass {
    public static void main(String[] args) {
      //primitive data:char, boolean,byte,short,int,long,float,double
      //classes are non-prim data
        //wrapper class: Character,Boolean, Byte, Sort, Integer, Long,Float,Double
        //wrapper classes take a lot of space in the memory
        //so if it isn't necessary we dont use wrapper classes
        //if you write n and put dot next to it you will see many methods
        //because wrapper classes include methods
        Integer n=12;
        //if you write m and put a dot next to it you will not see any methods
        int m=12;
        //find the min and max value of a data type by writing a code
        short maxShort=Short.MAX_VALUE;
        System.out.println(maxShort);
        short minShort=Short.MIN_VALUE;
        System.out.println(minShort);
        int maxInt=Integer.MAX_VALUE;
        System.out.println(maxInt);
        int minInt=Integer.MIN_VALUE;
        System.out.println(minInt);
        //convert primitive int to wrapper (can be an interview question)
        //this method is called autoboxing
        int num=13;
        Integer wrapperNum=num;
        //convert wrapper byte to primitive byte
        //this method is called unboxing
        Byte k=33;
        byte primK=k;
        //convert primitive char to wrapper char (autoboxing)
        char initial='Z';
        Character wrapperInitial=initial;
        //convert wrapper boolean to primit (unboxing)
        Boolean isOld=true;
        boolean isOldPRIM=isOld;

    }
}
