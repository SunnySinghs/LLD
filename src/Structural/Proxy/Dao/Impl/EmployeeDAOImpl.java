package Structural.Proxy.Dao.Impl;

import Structural.Proxy.Dao.EmployeeDAO;
import Structural.Proxy.Model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public void create(String client, Employee employee) {
        System.out.println("Creating Employee");
    }

    @Override
    public void delete(String client, Integer id) {
        System.out.println("Deleting Employee");
    }

    @Override
    public Employee get(String client, Integer id) {
        System.out.println("Fetching Employee");
        return new Employee();
    }
}
