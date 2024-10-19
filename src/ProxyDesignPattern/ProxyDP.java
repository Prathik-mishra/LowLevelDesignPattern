package ProxyDesignPattern;

public class ProxyDP {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new ProxyEmployeeDao();

        try{
            employeeDao.create("ADMIN",new EmployeeDo());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            employeeDao.create("USER",new EmployeeDo());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
