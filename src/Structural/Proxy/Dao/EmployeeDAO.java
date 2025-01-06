package Structural.Proxy.Dao;

import Structural.Proxy.Model.Employee;

public interface EmployeeDAO {
    public void create(String client, Employee employee) throws Exception;
    public void delete(String client, Integer id) throws Exception;
    public Employee get(String client, Integer id) throws Exception;

}
