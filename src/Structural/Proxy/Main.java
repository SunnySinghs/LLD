package Structural.Proxy;

import Structural.Proxy.Dao.EmployeeDAO;
import Structural.Proxy.Dao.Proxy.EmployeeDAOProxy;
import Structural.Proxy.Model.Employee;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAOProxy();
        try {
            employeeDAO.create("USER", new Employee());
            System.out.println("Operation Successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
