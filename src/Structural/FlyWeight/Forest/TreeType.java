package Structural.FlyWeight.Forest;

// Flyweight: Intrinsic State
public class TreeType implements Type{
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing tree: " + name + " [Color: " + color + ", Texture: " + texture + "] at (" + x + ", " + y + ")");
    }
}
