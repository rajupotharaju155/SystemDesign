package structural_design_patterns.facade_example;

public class DVDPlayer {
    public void turnOn() {
        System.out.println("DVD Player is on");
    }
    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }
}
