package com.rashika.employeeinfoservice.model;

public class Employee {
    private Integer id;
    private String employeeName;

    public Employee() {

    }

    public Employee(Integer id, String employeeName) {
        this.id = id;
        this.employeeName = employeeName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
