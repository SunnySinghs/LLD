package Structural.Composite.FileSystem.Solution;


import Structural.Composite.FileSystem.Solution.Interface.FileSystem;
import Structural.Composite.FileSystem.Solution.Interface.Impl.Directory;
import Structural.Composite.FileSystem.Solution.Interface.Impl.File;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movie Directory");

        FileSystem gadar = new File("Gadar");
        movieDirectory.add(gadar);

        Directory comedyMovieDirectory = new Directory("Comedy Movie Directory");
        FileSystem halchal = new File("Halchal");
        comedyMovieDirectory.add(halchal);

        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();
    }
}
