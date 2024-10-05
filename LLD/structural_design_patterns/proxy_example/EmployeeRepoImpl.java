package structural_design_patterns.proxy_example;

public class EmployeeRepoImpl implements EmployeeRepo {
    @Override
    public void create(String clientType, Employee employee) {
        System.out.println("Employee Created");
    }

    @Override
    public void delete(String clientType, int empID) {
        System.out.println("Employee Deleted");
    }

    @Override
    public Employee get(String clientType, int empID) {
        System.out.println("Fetching employee");
        return new Employee();
    }
}
