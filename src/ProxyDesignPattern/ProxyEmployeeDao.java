package ProxyDesignPattern;

public class ProxyEmployeeDao implements EmployeeDao{

    EmployeeDao employeeDao;
    ProxyEmployeeDao(){
        this.employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, EmployeeDo employeeDo) throws Exception {
        if(client.equals("ADMIN")){
            this.employeeDao.create(client,employeeDo);
        }else{
            throw new Exception("client is not ADMIN");
        }
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN")){
            this.employeeDao.delete(client,employeeId);
        }else{
            throw new Exception("client is not ADMIN");
        }


    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN")){
            return this.employeeDao.get(client,employeeId);
        }else{
            throw new Exception("client is not ADMIN");
        }
    }
}
