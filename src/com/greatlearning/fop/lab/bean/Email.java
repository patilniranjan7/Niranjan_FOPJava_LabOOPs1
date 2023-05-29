package com.greatlearning.fop.lab.bean;

public class Email {

    private Name name;
    private String email;

    public Email(Name name) {
        this.name = name;
     }

    public void generateEmailWithDepartment(Department department) {
        if(name.getLastName() != null )
            email =  this.name.getFirstName().toLowerCase() + "." + this.name.getLastName().toLowerCase() + "@" + department.departmentAlias + ".greatlearning.com";
        else
            email =  this.name.getFirstName().toLowerCase() + "@" + department.departmentAlias + ".greatlearning.com";
    }

    public String getEmail() {
        return email;
    }
}
