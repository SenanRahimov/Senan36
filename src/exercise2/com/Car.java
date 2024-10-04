package exercise2.com;

public class Car {
    String year;
    String model;

    public static void main(String[] args) {
        Car Car1 =new Car();
        Car1.model="Corolla";
        Car1.year="2015";

        Car Car2 =new Car();
        Car2.model="Optima";
        Car2.year="2011";

        System.out.println("Car model:" + Car1.model);
        System.out.println("Year:" +Car1.year);


        System.out.println("Car model:" + Car2.model);
        System.out.println("Year:" +Car2.year);




    }


}
