package com.greatlearning.fop.lab.service;

import java.util.Random;

public class PasswordGeneratorService {
    private String password = "";
    private String requiredPasswordCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*()";

    public void generatePassword() {

        Random random = new Random();
        int maxLen = requiredPasswordCharacters.length();
        int lengthOfPassword = 12;

        for(int i = 0; i < lengthOfPassword; ++i) {
            int charIndex = random.nextInt(maxLen);
            password += requiredPasswordCharacters.charAt(charIndex);
        }

    }

    public String getPassword() {
        return password;
    }
}
