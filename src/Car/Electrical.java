package Car;
public class Electrical extends Car {
    private int power;

    public Electrical (int power) {
        this.power = power;
    }

    public Electrical(String model, int year, int max_speed, String color, int power) {
        super(model, year,max_speed, color);
        this.power = power;

    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String getFuelType() {

        return getPower()+" Watts are needed for " + getModel()+ " car";
    }

}