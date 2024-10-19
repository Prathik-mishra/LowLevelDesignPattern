package ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client, EmployeeDo employeeDo) throws Exception {
        System.out.println("Created a new Employee in EmployeeTable");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("Deleted existing user from EmployeeTable with EmployeeId");
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        System.out.println("The Employee is : " +employeeId);
        return new EmployeeDo();
    }
}

