package factory_example;

import java.util.ArrayList;
import java.util.List;

public abstract class Course {
    protected List<Module> modules = new ArrayList<Module>();

    public Course(){
        System.out.println("Course CONSTRUCTOR");
        this.createCourse();
    };

    public List<Module> getModules(){
        return modules;
    }

    public abstract void createCourse();
}
