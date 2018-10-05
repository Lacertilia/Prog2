package Gammalt.Shapes;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return (Math.PI * this.radius * this.radius);
    }

    public double getPerimeter(){
        return (Math.PI * 2 * this.radius);
    }

    @Override
    public String toString(){
        return "A Circle with radius " + this.radius + super.toString();
    }
}
