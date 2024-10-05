package structural_design_patterns.facade_example;

// Facade class to simplify interaction with the home entertainment system
class HomeTheaterFacade {
    private TV tv;
    private DVDPlayer dvdPlayer;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(TV tv, DVDPlayer dvdPlayer, SoundSystem soundSystem) {
        this.tv = tv;
        this.dvdPlayer = dvdPlayer;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String movie) {
        System.out.println("Setting up the home theater to watch a movie...");
        tv.turnOn();
        tv.setChannel(3); // Assuming channel 3 is the DVD input
        dvdPlayer.turnOn();
        dvdPlayer.play(movie);
        soundSystem.turnOn();
        soundSystem.setVolume(10);
        System.out.println("Movie setup complete. Enjoy your movie!");
    }
}