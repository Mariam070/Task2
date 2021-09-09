package Car;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        Electrical car1 = new Electrical("tesla", 2018, 200, "white", 600);
        Gas car2= new Gas ("fiat",2007,120,"black",92);
        System.out.println(car1.getFuelType());
        System.out.println(car2.getFuelType());
        System.out.println("Number of created object is: "+Car.getCars_number());

    }
}
