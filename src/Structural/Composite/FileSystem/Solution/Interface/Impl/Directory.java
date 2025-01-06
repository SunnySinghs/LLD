package Structural.Composite.FileSystem.Solution.Interface.Impl;

import Structural.Composite.FileSystem.Solution.Interface.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String name;
    List<FileSystem> list;

    public Directory(String name) {
        this.name = name;
        this.list = new ArrayList<>();
    }

    public void add(FileSystem obj) {
        list.add(obj);
    }

    @Override
    public void ls() {
        for (FileSystem obj: list) {
            obj.ls();
        }
    }
}
