package Car;
public abstract class Car {
    private String model;
    private int year;
    private int max_speed;
    private String color;
    private static int cars_number;

    public Car() {
    }

    public Car(int cars_number) {
        cars_number++;
    }

    public Car(String model, int year, int max_speed, String color) {
        this.model = model;
        this.year = year;
        this.max_speed = max_speed;
        this.color = color;
        cars_number++;
    }


    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public abstract String getFuelType();


    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMax_speed() {
        return this.max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getCars_number() {
        return cars_number;
    }
}