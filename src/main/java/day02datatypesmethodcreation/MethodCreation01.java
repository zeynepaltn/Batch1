package day02datatypesmethodcreation;

public class MethodCreation01 {
 /*
 How to create a method in java
 1) it is created outside of main method
 2)Access Modifier+static+return type+Name of the method+()+{}
 how to use the created methods?
 used from Inside the main method
 in orde to call it from main method: method name+()

  */
 public static void main(String[] args) {
int result=makeAddition(3,5);
  System.out.println(result);
  long resultMultiplication=multiply(3,6);
  System.out.println(resultMultiplication);
 int sonuc=operations(2,3,4);
     System.out.println(sonuc);
     System.out.println(getCube(3));
     print("Hello world");

 }
//example for creating a method which makes addition
 public static int makeAddition(int a, int b){
  return a+b;
 }
 //create a method which multiplies two numbers
 //main method is static so everything inside the main method must be static
 protected static long multiply(int a, int b){
  return a*b;
 }
 private static int operations(int a, int b, int c){
  return a*b+c;
 }

  static double getCube(double a) {
     return a*a*a;}
     //if you want ACCESS MODIFIER to be default then don't write default

public static void print(String str){
    System.out.println(str);
}
//if the return type is void inside the method body no need to write return
    //if a method does not produce a new data the it's return type is void.
}
