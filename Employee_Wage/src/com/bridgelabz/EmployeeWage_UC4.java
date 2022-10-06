package com.bridgelabz;

public class EmployeeWage_UC4 {

        static final int IS_PART_TIME= 1;
        static final int IS_FULL_TIME= 2;
        static final int WAGE_PER_HOUR= 20;
        public static void main(String[] args) {
            System.out.println("Welcome to Part Time using case Employee Wage");
            int empHrs = 0;
            int empWage = 0;
            int randomVal = (int)Math.floor(Math.random()*10) % 3;

            empHrs = switch (randomVal) {
                case IS_PART_TIME -> 4;
                case IS_FULL_TIME -> 8;
                default -> 0;
            };

            empWage = WAGE_PER_HOUR * empHrs;
            System.out.println("Emp Wage:" + empWage);
        }
    }
