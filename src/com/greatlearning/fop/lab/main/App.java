package com.greatlearning.fop.lab.main;

import com.greatlearning.fop.lab.bean.Department;
import com.greatlearning.fop.lab.bean.Email;
import com.greatlearning.fop.lab.bean.Employee;
import com.greatlearning.fop.lab.bean.Name;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Department[] departments = {
                new Department("Technical", "tech"),
                new Department("Admin", "admin"),
                new Department("Human Resource", "hr"),
                new Department("Legal", "legal")
        };
        int departmentChoice = 0;

        System.out.println("Enter Employee Name");

        String name = sc.nextLine().trim();

        System.out.println("Please enter the department number from the following");

        for(int i = 0; i<departments.length; ++i) {
            System.out.println(String.format("[%d] %s", i+1, departments[i].departmentName));
        }

        try {
            departmentChoice = sc.nextInt();
        }
        catch (InputMismatchException inputMismatchException) {
            System.out.println("\nInvalid Input...\n\nStopping the application...");
            System.exit(0);
        }

        if(isDepartmentChoiceInValid(departmentChoice)) {
            System.out.println("\nInvalid choice... \n\nStopping the application");
            System.exit(0);
        }

        Name employeeName = new Name(name);

        Email email = new Email(employeeName);
        email.generateEmailWithDepartment(departments[departmentChoice-1]);

        Employee employee = new Employee(employeeName, email);

        String employeeEmail = employee.getCredentials()[0];
        String employeePassword = employee.getCredentials()[1];


        System.out.println(String.format("Dear %s your generated credentials are as followed\n" +
                "Email\t\t--->\t%s\n" +
                "Password\t--->\t%s\n", employee.name.getFirstName(), employeeEmail,  employeePassword));


    }

    public static boolean isDepartmentChoiceInValid(int departmentChoice) {
        return departmentChoice < 1  || departmentChoice > 4;
    }

}
