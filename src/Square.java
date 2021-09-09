public class Square implements Shape{
    private double length;

    public Square(double length) {
        this.length=length;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String getShapeName() {
        return "this is a square";
    }

    @Override
    public Double getArea() {
        return length*length;
    }
}
