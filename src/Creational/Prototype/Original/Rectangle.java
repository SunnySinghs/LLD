package Creational.Prototype.Original;

public class Rectangle extends Shape {

    public Rectangle() {
        setType("Rectangle");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
