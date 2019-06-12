package com.rashika.employeeinfoservice.controller;

import com.rashika.employeeinfoservice.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeInfoController {

    @RequestMapping("/{id}")
    public Employee getEmployeeInfo(@PathVariable Integer id){
        //TODO. Use H2
        switch(id){
            case 1:
                return new Employee(1, "Rashika Devadiga");
            case 2:
                return new Employee(2, "Hitesh Devadiga");
            case 3:
                return new Employee(3, "Jayanti Devadiga");
            case 4:
                return new Employee(4, "Sadashiv Devadiga");
            case 5:
                return new Employee(5, "Mohini Jain");
            default:
                return new Employee(6, "Pritesh Devadiga");
        }
    }
}
