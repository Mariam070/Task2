public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "this is a circle";
    }

    @Override
    public Double getArea() {
        return (22*radius*radius)/7;
    }
}
