package Creational.Factory;

public class Main {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getInstance("CIRCLE");
        shape.draw();
    }
}
