package com.javatech.controller;

import com.javatech.domain.Employee;
import com.javatech.domain.EmployeeDTO;
import com.javatech.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("employeeName")
    public String getEmployeeName(){
        return "Sangram";
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<?> getEmployeeByEmpId(@PathVariable("id") Long id){
        Optional<Employee> employee = employeeService.getEmployeeById(id);

        if (employee.isPresent()) {
            return ResponseEntity.ok(employee.get());
        }

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body("Employee not found for empId : " + id);
    }

    @PostMapping("/employee")
    public ResponseEntity<?> createEmployee(@RequestBody EmployeeDTO employee){

        Employee employeeSaved = employeeService.createEmployee(employee);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Employee Created Successfully : "+employeeSaved);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public ResponseEntity<?> deleteEmployeeByEmpId(@PathVariable("id") Long id){
        Optional<Employee> employee = employeeService.getEmployeeById(id);

        if (employee.isPresent()) {
            employeeService.deleteEmployee(id);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Employee Deleted Successfully : " + id);
        }

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body("Employee not found for empId : " + id);
    }


}
