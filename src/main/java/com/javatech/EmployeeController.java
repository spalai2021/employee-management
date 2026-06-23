package com.javatech;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @RequestMapping("employeeName")
    public String getEmployeeName(){
        return "Sangram";
    }
}
