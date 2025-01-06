package Structural.FlyWeight.Forest;

import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {
    private static Map<String, TreeType> map = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + "_" + color + "_" + texture;
        if (!map.containsKey(key)) {
            TreeType treeType = new TreeType(name, color, texture);
            map.put(key, treeType);
            return treeType;
        }
        return map.get(key);
    }

}
