package day03scanner;

public class Runner {
    //no need to create main method for each class
    //one main method can run many classes
    public static void main(String[] args) {
        //how to create an object
        //when creating an object; class name+object name+assigning an operator+"new"+constructor
        Car myCar=new Car();
        //"new" is a keyword and it is used when creating a new object from scratch.
        //constructor in java is a special method used to create objects
        System.out.println( myCar.price);
        System.out.println(myCar.model);
        myCar.movement();
        myCar.stop();
        Student tomHanks=new Student();
        System.out.println("tomHanks.name = " + tomHanks.name);
        System.out.println("tomHanks.grade = " + tomHanks.grade);
        System.out.println("tomHanks.address = " + tomHanks.address);
        tomHanks.feed();
        tomHanks.study();

    }
}
