package org.mari.springbootsmsapi.service;

import org.mari.springbootsmsapi.entity.Employee;
import org.mari.springbootsmsapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> searchEmployeeByName(String searchText) {
        return employeeRepository.searchEmployee(searchText);
    }
}
