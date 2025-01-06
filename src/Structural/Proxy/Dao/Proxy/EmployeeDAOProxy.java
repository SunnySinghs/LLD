package Structural.Proxy.Dao.Proxy;

import Structural.Proxy.Dao.EmployeeDAO;
import Structural.Proxy.Dao.Impl.EmployeeDAOImpl;
import Structural.Proxy.Model.Employee;

public class EmployeeDAOProxy implements EmployeeDAO {

    EmployeeDAO employeeDAO;

    public EmployeeDAOProxy() {
        this.employeeDAO = new EmployeeDAOImpl();
    }

    @Override
    public void create(String client, Employee employee) throws Exception {
        if ("ADMIN".equals(client)) {
            employeeDAO.create(client, employee);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, Integer id) throws Exception {
        if ("ADMIN".equals(client)) {
            employeeDAO.delete(client, id);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public Employee get(String client, Integer id) throws Exception {
        if ("ADMIN".equals(client) || "USER".equals(client)) {
            return employeeDAO.get(client, id);
        }
        throw new Exception("Access Denied");
    }
}
