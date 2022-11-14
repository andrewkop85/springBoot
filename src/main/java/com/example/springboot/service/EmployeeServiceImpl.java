package com.example.springboot.service;

import com.example.springboot.dao.EmployeeDAO;
import com.example.springboot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDAO dao;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return dao.getAllEmployees();
    }
//
//    @Override
//    @Transactional
//    public void saveEmployee(Employee employee) {
//        dao.saveEmployee(employee);
//    }
//
//    @Override
//    @Transactional
//    public Employee getEmployee(int empID) {
//        return dao.getEmployee(empID);
//    }
//
//    @Override
//    @Transactional
//    public void deleteEmployee(int empID) {
//        dao.deleteEmployee(empID);
//    }

}
