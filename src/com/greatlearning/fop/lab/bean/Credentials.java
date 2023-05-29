package com.greatlearning.fop.lab.bean;

public class Credentials {

    private Email email;
    private Password password;

    Credentials(Email email, Password password) {
        this.email = email;
        this.password = password;
    }

    public String[] getCredentials() {
        return new String[]{this.email.getEmail(), this.password.getPassword()};
    }
}
