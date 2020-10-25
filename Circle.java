package HomeWork.Lab10;

public class Circle extends Shape {
    private double radius;
    public Circle(String color,double radius,boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public Circle(){
        super();
        this.radius = 1.0;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + super.toString() +
                '}';
    }

}
