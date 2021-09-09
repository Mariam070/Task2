public class Main {
    public static void main(String args[]){
        Circle c=new Circle(3.0);
        Square s=new Square(4.0);
        DisplayShape(c);
        DisplayShape(s);

    }
    public static void DisplayShape(Shape shape){
        System.out.println("The name of the shape is : "+shape.getShapeName()+" with area : "+shape.getArea());
    }}
