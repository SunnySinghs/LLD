package Structural.Composite.FileSystem.Problem;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String name;
    List<Object> list;

    public Directory(String name) {
        this.name = name;
        this.list = new ArrayList<>();
    }

    public void add(Object obj) {
        list.add(obj);
    }

    public void ls() {
        for (Object obj: list) {
            if (obj instanceof File) {
                ((File)obj).ls();
            } else {
                ((Directory)obj).ls();
            }
        }
    }
}
