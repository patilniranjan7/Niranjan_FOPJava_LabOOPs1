package com.greatlearning.fop.lab.bean;

public class Name {

    private static String firstName;
    private static String middleName;
    private static String lastName;
    private static String name;
    private static String fullName;

    public Name(String name) {
        String[] splitName = name.split(" ");
        this.firstName = splitName[0];
        if(splitName.length > 1) {
            this.lastName = splitName[splitName.length-1];
            this.name = firstName + " " + lastName;
        }

        if(splitName.length > 2) {
            for(int i = 1; i<splitName.length-2; ++i)
                this.middleName = splitName[i] + " ";
            this.middleName = splitName[splitName.length - 2];
            this.fullName = firstName + " " + middleName + " " + lastName;
        }
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        Name.firstName = firstName;
    }

    public static String getMiddleName() {
        return middleName;
    }

    public static void setMiddleName(String middleName) {
        Name.middleName = middleName;
    }

    public static String getLastName() {
        return Name.lastName;
    }

    public static void setLastName(String lastName) {
        Name.lastName = lastName;
    }

    public static String getName() {
        return name;
    }

    public static String getFullName() {
        return fullName;
    }




}
