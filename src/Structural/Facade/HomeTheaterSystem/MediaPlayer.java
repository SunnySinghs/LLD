package Structural.Facade.HomeTheaterSystem;

public class MediaPlayer {
    public void load(String movie) {
        System.out.println("Media player loading: " + movie);
    }

    public void play() {
        System.out.println("Media player playing.");
    }

    public void stop() {
        System.out.println("Media player stopped.");
    }
}
