package org.mari.springbootsmsapi.service;

import org.mari.springbootsmsapi.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployee();

    public Employee createEmployee(Employee employee);

    public List<Employee> searchEmployeeByName(String searchText);
}
