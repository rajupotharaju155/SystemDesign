package factory_example;

public class HLD extends Course {
    HLD(){
        System.out.println("HLD CONSTRUCTOR");
    }
    @Override
    public void createCourse() {
        System.out.println("createCourse in HLD");
        modules.add(new DemoModule());
        modules.add(new ExerciseModule());
        
    }
}
