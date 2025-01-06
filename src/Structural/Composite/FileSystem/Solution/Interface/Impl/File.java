package Structural.Composite.FileSystem.Solution.Interface.Impl;

import Structural.Composite.FileSystem.Solution.Interface.FileSystem;

public class File implements FileSystem {
    String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println("File Name: " + name);
    }
}
