package com.rashika.employeemanagerinfoservice.model;

public class EmployeeManagerInfo {
    private String managerName;
    private String employeeName;

    public EmployeeManagerInfo(){

    }

    public EmployeeManagerInfo(String employeeName, String managerName) {
        this.employeeName = employeeName;
        this.managerName = managerName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
