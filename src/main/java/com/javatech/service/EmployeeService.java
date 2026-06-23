package com.javatech.service;

import com.javatech.domain.Employee;
import com.javatech.domain.EmployeeDTO;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> getAllEmployee();
    Optional<Employee> getEmployeeById(Long empId);
    void deleteEmployee(Long id);
    Employee createEmployee(EmployeeDTO employeeDTO);
}
