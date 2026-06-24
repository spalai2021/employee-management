package com.javatech.properties;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
@Data
@Getter
public class EmployeeProperties {

    private String name;
    private String companyName;
    private String country;
}
