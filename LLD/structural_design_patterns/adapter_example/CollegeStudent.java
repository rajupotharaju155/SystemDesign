package structural_design_patterns.adapter_example;

public class CollegeStudent implements Student{
    private String name;
    private String email;
    CollegeStudent(String name, String email){
        this.name = name;
        this.email = email;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getName() {
        return name;
    }
}
