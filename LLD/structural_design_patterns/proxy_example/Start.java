package structural_design_patterns.proxy_example;

public class Start {
    public static void main(String[] args) {
        EmployeeRepoProxyImpl employeeRepoProxyImpl = new EmployeeRepoProxyImpl();
        try {
            // employeeRepoProxyImpl.create("EMPLOYEE", new Employee());
            employeeRepoProxyImpl.create("ADMIN", new Employee());
            employeeRepoProxyImpl.get("ADMIN1", 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
