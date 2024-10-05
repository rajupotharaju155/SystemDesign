package structural_design_patterns.facade_example;

public class Start {
    public static void main(String[] args) {
        TV tv = new TV();
        DVDPlayer dvdPlayer = new DVDPlayer();
        SoundSystem soundSystem = new SoundSystem();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, dvdPlayer, soundSystem); //hidden all complexity behind this Facade
        homeTheater.watchMovie("Inception");
    }
}
