package com.bridgelabz;

public class EmployeeWage_UC2 {
    public static void main(String[] args) {
        int WAGE_PER_HOUR = 20;
        System.out.println("Welcome to Employee Wage");
        int randomVal = (int) Math.floor(Math.random() * 10) % 2;
        if (randomVal == 1) {
            int empHrs = 8;
            int empWage = WAGE_PER_HOUR * empHrs;
            System.out.println("Emp Wage:" + empWage);
            System.out.println("Employee is Present");
        }
        else
            System.out.println("Employee is Absent");
    }

}

