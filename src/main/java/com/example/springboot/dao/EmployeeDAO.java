package com.example.springboot.dao;


import com.example.springboot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployee(int empID);
    public void deleteEmployee(int empID);
}
