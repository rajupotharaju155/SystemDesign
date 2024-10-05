package structural_design_patterns.facade_example;

public class TV {
    public void turnOn() {
        System.out.println("TV is on");
    }
    public void setChannel(int channel) {
        System.out.println("TV set to channel " + channel);
    }
}
