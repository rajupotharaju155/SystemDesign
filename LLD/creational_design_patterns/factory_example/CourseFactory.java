package factory_example;

public class CourseFactory {
    public Course getCourse(String courseType){
        if(courseType=="HLD"){
            return new HLD();
        }else if(courseType=="LLD"){
            return new LLD();
        }else{
            return null;
        }
    }
}
