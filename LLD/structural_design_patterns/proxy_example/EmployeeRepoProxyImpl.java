package structural_design_patterns.proxy_example;

public class EmployeeRepoProxyImpl implements EmployeeRepo {
    EmployeeRepoImpl employeeRepoImpl;
    EmployeeRepoProxyImpl(){
        this.employeeRepoImpl = new EmployeeRepoImpl();
    }
    @Override
    public void create(String clientType, Employee employee) throws Exception {
        if(clientType=="ADMIN")
            employeeRepoImpl.create(clientType, employee);
        else
            throw new Exception("Access Denied");
    }

    @Override
    public void delete(String clientType, int empID) throws Exception{
        if(clientType=="ADMIN")
            employeeRepoImpl.delete(clientType, empID);
        else
            throw new Exception("Access Denied");

    }

    @Override
    public Employee get(String clientType, int empID) throws Exception{
        if(clientType=="ADMIN" || clientType=="EMPLOYEE")
            return employeeRepoImpl.get(clientType, empID);
        else 
            throw new Exception("Invalid Client");
    }
}
