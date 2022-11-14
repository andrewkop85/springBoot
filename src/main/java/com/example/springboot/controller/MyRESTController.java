package com.example.springboot.controller;

import com.example.springboot.entity.Employee;
import com.example.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    EmployeeService service;

    @GetMapping("/employees")
    List<Employee> showAllEmployees() {
        List<Employee> employees = service.getAllEmployees();
        return employees;
    }

    @GetMapping("/employees/{id}")
    Employee getEmployee(@PathVariable int id) {
        Employee employee = service.getEmployee(id);
//        if (employee==null) {
//            throw new NoSuchEmployeeException("Пользователь с ID = " + id + " не найден в БД");
//        }
        return employee;
    }

    @PostMapping("/employees")
    Employee addEmployee(@RequestBody Employee employee) {
        service.saveEmployee(employee);
        return employee;
    }

    @PutMapping("/employees")
    Employee updateEmployee(@RequestBody Employee employee) {
        service.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    String deleteEmployee(@PathVariable int id) {
        Employee employee = service.getEmployee(id);
//        if (employee == null) {
//            throw new NoSuchEmployeeException("There is no employee with id = " + id);
//        }
        service.deleteEmployee(id);
        return "Employee with id = " + id + " was deleted";
    }

}

