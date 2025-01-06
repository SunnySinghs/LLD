package Structural.Composite.FileSystem.Problem;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movie Directory");

        File gadar = new File("Gadar");
        movieDirectory.add(gadar);

        Directory comedyMovieDirectory = new Directory("Comedy Movie Directory");
        File halchal = new File("Halchal");
        comedyMovieDirectory.add(halchal);

        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();
    }
}
