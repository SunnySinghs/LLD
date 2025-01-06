package Structural.FlyWeight.Forest;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();

        // Plant trees
        forest.plantTree(1, 1, "Oak", "Green", "Rough");
        forest.plantTree(2, 3, "Pine", "Dark Green", "Smooth");
        forest.plantTree(1, 1, "Oak", "Green", "Rough"); // Reuses Oak tree type

        // Draw the forest
        System.out.println("Drawing forest:");
        forest.draw();
    }
}
