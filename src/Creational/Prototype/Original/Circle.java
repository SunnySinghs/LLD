package Creational.Prototype.Original;

public class Circle extends Shape {
    public Circle() {
        setType("Circle");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
