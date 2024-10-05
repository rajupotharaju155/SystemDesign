package structural_design_patterns.adapter_example;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent("John", "john@gmail.com");
        SchoolStudent ss = new SchoolStudent("Kevin", "kevin@gmail.com");

        List<Student> studentList = new ArrayList<>();
        studentList.add(cs);
        // studentList.add(ss); // SchoolStudent is NOT of type Student;

        studentList.add(new SchoolStudentAdapter(ss)); // Wrapping in SchoolStudentAdapter to make it work

        System.out.println(studentList);

    }
}
