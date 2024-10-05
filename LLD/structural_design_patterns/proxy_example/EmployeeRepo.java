package structural_design_patterns.proxy_example;

public interface EmployeeRepo {
    public void create(String clientType, Employee employee) throws Exception;
    public void delete(String clientType, int empID) throws Exception;
    public Employee get(String clientType, int empID) throws Exception;
}
