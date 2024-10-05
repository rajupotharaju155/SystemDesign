package structural_design_patterns.facade_example;

public class SoundSystem {
    public void turnOn() {
        System.out.println("Sound system is on");
    }
    public void setVolume(int volume) {
        System.out.println("Volume set to " + volume);
    }
}
