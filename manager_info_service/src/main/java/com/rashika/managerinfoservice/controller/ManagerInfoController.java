package com.rashika.managerinfoservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rashika.managerinfoservice.model.Manager;

@RestController
@RequestMapping("manager")
public class ManagerInfoController {

    @RequestMapping("/{id}")
    public Manager getManagerDetails(@PathVariable Integer employeeId){
        switch(employeeId){
            case 1:
                return new Manager(1, 5);
            case 2:
                return new Manager(2, 4);
            case 3:
                return new Manager(3, 3);
            case 4:
                return new Manager(4, 2);
            case 5:
                return new Manager(5, 1);
            default:
                return new Manager(1, 2);
        }
    }

}
