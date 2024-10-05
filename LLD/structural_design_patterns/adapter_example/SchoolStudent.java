package structural_design_patterns.adapter_example;

public class SchoolStudent {
    private String name;
    private String email;
    SchoolStudent(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
