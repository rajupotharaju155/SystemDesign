package factory_example;

public class LLD extends Course{
    @Override
    public void createCourse() {
        modules.add(new IntroModule());
        modules.add(new DemoModule());
    }
}
