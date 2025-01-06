package Structural.FlyWeight.Forest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Forest {
    private List<Tree> list = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType treeType = new TreeType(name, color, texture);
        Tree tree = new Tree(x, y, treeType);
        list.add(tree);
    }

    public void draw() {
        for(Tree tree: list) {
            tree.draw();
        }
    }
}
