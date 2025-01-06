package Structural.Composite.FileSystem.Problem;

public class File {
    String name;

    public File(String name) {
        this.name = name;
    }

    public void ls() {
        System.out.println("File Name: " + name);
    }
}
