package day03scanner;

public class Car {
    //create variables (passive)
    public String model="Corolla";
    public int price=20000;
    //Create methods (active)
    public void movement(){
        //if return type is void there will be no "return"
        //if a method does not produce a new data then the return type is void
        System.out.println("Corolla moves fast...");

    }
    public void stop(){
        System.out.println("Corolla stops safely");
    }

}
