package exercise3.com;

public class Phone {
    String brand;
    String model;
    double price;

    public static void main(String[] args) {
        Phone phone1=new Phone();
        phone1.brand="Samsung";
        phone1.model="Galaxy S21";
        phone1.price=799.99;


        Phone phone2=new Phone();
        phone2.brand="Iphone";
        phone2.model="Iphone 16 pro max";
        phone2.price=7320;

        System.out.println("brand :"+phone1.brand);
        System.out.println("model:" +phone1.model);
        System.out.println("price :"+phone1.price);

        System.out.println("brand :"+phone2.brand);
        System.out.println("model:" +phone2.model);
        System.out.println("price :"+phone2.price);

    }
}
