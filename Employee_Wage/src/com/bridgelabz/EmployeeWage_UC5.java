package com.bridgelabz;

public class EmployeeWage_UC5 {
    static final int IS_PART_TIME= 1;
    static final int IS_FULL_TIME= 2;
    static final int WAGE_PER_HOUR= 20;
    static final int MAX_WORKING_DAYS = 20;
    public static void main(String[] args) {
        System.out.println("Welcome to Part Time using case Employee Wage");
        int empHrs = 0;
        int empWage = 0;
        int totalWage= 0;
        int randomVal = (int)Math.floor(Math.random()*10) % 3;

        switch (randomVal){
            case IS_PART_TIME:
                empHrs = 4;
                break;
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            default:
                empHrs = 0;
        }

        empWage = WAGE_PER_HOUR * empHrs;
        totalWage = empWage * MAX_WORKING_DAYS;
        System.out.println("Emp Wage:" + totalWage);
    }
}