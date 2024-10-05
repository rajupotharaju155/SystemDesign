package structural_design_patterns.adapter_example;

public class SchoolStudentAdapter implements Student {
    private SchoolStudent schoolStudent;
    SchoolStudentAdapter(SchoolStudent schoolStudent){
        this.schoolStudent = schoolStudent;
    }

    @Override
    public String getName() {
        return schoolStudent.getName();
    }

    @Override
    public String getEmail() {
        return schoolStudent.getEmail();
    }
}
