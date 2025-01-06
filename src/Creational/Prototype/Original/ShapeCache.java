package Creational.Prototype.Original;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {

    private static Map<String, Shape> map = new HashMap<>();

    public static Shape getShape(String id) {
        Shape shape = map.get(id);
        return (Shape) shape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        map.put("1", circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        map.put("2", rectangle);
    }


}
