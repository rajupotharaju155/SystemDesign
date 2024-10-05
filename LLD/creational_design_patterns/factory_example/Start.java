package factory_example;

public class Start {
    public static void main(String[] args) {
        Course hldCourse = new CourseFactory().getCourse("HLD"); //factory method to create object
        Course lldCourse = new CourseFactory().getCourse("LLD"); //factory method to create object
        Course abcd = new CourseFactory().getCourse("ABCD"); //factory method to create object

        System.out.println(abcd);
        assert hldCourse != null;
        System.out.println("HLD Courses are: "+ hldCourse.getModules());
        assert lldCourse !=null;
        System.out.println("LLD Courses are: "+ lldCourse.getModules());
    }
}
