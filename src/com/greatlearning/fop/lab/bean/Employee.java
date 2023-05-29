package com.greatlearning.fop.lab.bean;

import com.greatlearning.fop.lab.service.PasswordGeneratorService;

public class Employee {
    public Name name;
    public Email email;
    private Password password;
    private Credentials credentials;
    public Employee(Name name, Email email) {
        this.name = name;
        this.email = email;
        generatePassword();
        this.credentials = new Credentials(this.email, this.password);
    }
    public void generatePassword() {
        PasswordGeneratorService passwordGeneratorService = new PasswordGeneratorService();
        passwordGeneratorService.generatePassword();
        this.password = new Password(passwordGeneratorService.getPassword());
    }
    public String[] getCredentials() {
        return this.credentials.getCredentials();
    }



}
