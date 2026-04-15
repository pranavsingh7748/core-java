package concept_3.static1;

class Mobile {
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println("Brand- " + brand + "/" + "Price- " + price + "/" + "Name- " + name);
    }
}

public class staticVariable {
    public static void main(String[] args) {

        Mobile obj1=  new Mobile();

        obj1.brand="Apple";
        obj1.price = 1990;
        Mobile.name = "SmartPhone";

        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price = 2000;
        Mobile.name = "SmartPhone";

        Mobile.name="Phone";


        obj1.show();
        obj2.show();

    }
}
