package com.rashika.managerinfoservice.model;

public class Manager {
    private Integer managerId;
    private Integer employeeId;

    public Manager(){

    }

    public Manager(Integer managerId, Integer employeeId) {
        this.managerId = managerId;
        this.employeeId = employeeId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
}
