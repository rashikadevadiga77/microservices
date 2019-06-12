package com.rashika.employeemanagerinfoservice.controller;

import com.rashika.employeemanagerinfoservice.model.Employee;
import com.rashika.employeemanagerinfoservice.model.EmployeeManagerInfo;
import com.rashika.employeemanagerinfoservice.model.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("managerinfo")
public class EmployeeManagerInfoController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/{id}")
    public EmployeeManagerInfo getManagerInfo(@PathVariable Integer employeeId){
        Employee employee = restTemplate.getForObject("http://employee-info-service/employee/"+employeeId, Employee.class);
        Manager employee_manager = restTemplate.getForObject("http://manager-info-service/employee/"+employeeId, Manager.class);
        Employee manager = restTemplate.getForObject("http://employee-info-service/employee/"+employee_manager.getManagerId(), Employee.class);

        return new EmployeeManagerInfo(employee.getEmployeeName(), manager.getEmployeeName());

    }
}
