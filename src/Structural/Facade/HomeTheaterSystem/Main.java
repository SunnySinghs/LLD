package Structural.Facade.HomeTheaterSystem;

public class Main {
    public static void main(String[] args) {
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        MediaPlayer mediaPlayer = new MediaPlayer();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(projector, soundSystem, mediaPlayer);

        homeTheater.startMovie("Inception");
        System.out.println();
        homeTheater.endMovie();
    }
}
