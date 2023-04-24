package practises;

public class Q01_Variables {
    public static void main(String[] args) {
        //initialize a variable
        int age=34;
        int number=55;
        String name="Zeynep";
        System.out.println(age);
        System.out.println("age = " + age);
        System.out.println("number="+number);
        System.out.println("my name = " + name);
        System.out.println(name);
        //copy the value of the variable
        int hisAge=age;
        System.out.println("hisAge = " + hisAge);
        String hisName=name;
        System.out.println("name = " + name);
        //create many variables in one line
        int year=2022, month=3, day=15;
        System.out.println("day = " +day);
        System.out.println(year+" "+month+" "+day);
        System.out.println("year = " + year);
        //Updating value of a variable
        year=2023;
        System.out.println("year = " + year);
        //declare a variable
        double x;
        //start another variable y and z
        double y=100.543;
        double z=43;
        // start x variable with y variable
        x=y;
        // update x variable
        x=3.14;
        //print the variable
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

    }
}
