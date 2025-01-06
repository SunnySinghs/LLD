package Structural.Facade.HomeTheaterSystem;

public class HomeTheaterFacade {
    private Projector projector;
    private SoundSystem soundSystem;
    private MediaPlayer mediaPlayer;

    public HomeTheaterFacade(Projector projector, SoundSystem soundSystem, MediaPlayer mediaPlayer) {
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.mediaPlayer = mediaPlayer;
    }

    public void startMovie(String movie) {
        System.out.println("Starting movie setup...");
        projector.turnOn();
        projector.setInput("HDMI");
        soundSystem.turnOn();
        soundSystem.setVolume(10);
        mediaPlayer.load(movie);
        mediaPlayer.play();
        System.out.println("Movie started!");
    }

    public void endMovie() {
        System.out.println("Ending movie setup...");
        mediaPlayer.stop();
        projector.turnOff();
        soundSystem.turnOff();
        System.out.println("Movie ended!");
    }
}
