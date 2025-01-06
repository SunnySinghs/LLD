package Behavioral.Interpreter;

import Behavioral.Momento.Main;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private Map<String, Integer> map = new HashMap<>();

    public void put(String key, Integer value) {
        map.put(key, value);
    }

    public Integer get(String key) {
        return map.get(key);
    }
}
