package com.javatech.controller;

import com.javatech.properties.EmployeeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationPropertiesController {

    @Autowired
   private EmployeeProperties employeeProperties;

    /**
     * Reads the employee details from the properties file using the @ConfigurationProperties annotation
     * and returns them as a formatted string.
     */
    @GetMapping("/empDetailsProps")
    public String getEmployeeDetails(){
        return "Name : "+employeeProperties.getName() +" - "+" Company Name: "+employeeProperties.getCompanyName() +" - "+ " Country: "+employeeProperties.getCountry();
    }
}
