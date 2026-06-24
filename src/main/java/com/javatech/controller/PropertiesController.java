package com.javatech.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

    @Value("${name}")
    private String name;
    @Value("${companyName}")
    private String companyName;
    @Value("${country}")
    private String country;

    /**
     * Reads the employee details from the properties file using the @Value annotation
     * and returns them as a formatted string.
     */
    @GetMapping("/empDetails")
    public String getEmployeeDetails(){
        return "Name : "+name +" - "+" Company Name: "+companyName +" - "+ " Country: "+country;
    }
}
