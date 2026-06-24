package com.javatech.service;

import com.javatech.domain.Employee;
import com.javatech.domain.EmployeeDTO;
import com.javatech.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAllEmployee() {
        Iterable<Employee> employees = employeeRepository.findAll();
        return (List<Employee>) employees;
    }

    @Override
    public Optional<Employee> getEmployeeById(Long empId) {

        return employeeRepository.findById(empId);
    }

    @Override
    public void deleteEmployee(Long id) {
         employeeRepository.deleteById(id);
    }

    @Override
    public Employee createEmployee(EmployeeDTO employeeDTO) {

        Employee employee = new Employee();
        employee.setId(employeeDTO.getId());
        employee.setAge(employeeDTO.getAge());
        employee.setFirstName(employeeDTO.getFirstName());
        employee.setLastName(employeeDTO.getLastName());
        employee.setDeptName(employeeDTO.getDeptName());
        employee.setSalary(employeeDTO.getSalary());
        employeeRepository.save(employee);
        return employee;
    }
}
