package Car;
public class Gas extends Car {
    private int benzine;

    public Gas(int benzine) {

        this.benzine = benzine;
    }

    public Gas(String model, int year, int max_speed, String color, int benzine) {
        super(model, year, max_speed, color);
        this.benzine = benzine;
    }

    public int getBenzine() {

        return benzine;
    }

    public void setBenzine(int benzine) {

        this.benzine = benzine;
    }

    public String getFuelType() {

        return "the car " +getModel()+" takes benzine "+getBenzine();
    }
}