package Creational.Prototype.Original;

public class Main {
    public static void main(String[] args) {
        // Load prototypes into the cache
        ShapeCache.loadCache();

        // Retrieve and clone shapes
        Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShape1.getType());
        clonedShape1.draw();

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedShape2.getType());
        clonedShape2.draw();


    }
}
