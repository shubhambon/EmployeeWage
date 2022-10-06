package com.bridgelabz;

public class EmployeeWage_UC6 {
    static final int IS_PART_TIME= 1;
    static final int IS_FULL_TIME= 2;
    static final int WAGE_PER_HOUR= 20;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;
    public static void main(String[] args) {
        System.out.println("Wages till a condition reaches");
        int empHrs = 0;
        int empWage = 0;
        int totalWage = 0;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;
        while (totalWorkingDays < MAX_WORKING_DAYS && totalWorkingHours <= MAX_WORKING_HOURS) {
            int randomVal = (int) Math.floor(Math.random() * 10) % 3;

            switch (randomVal) {
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
            if (totalWorkingHours + empHrs <= 100) {
                totalWorkingHours = totalWorkingHours + empHrs;
            }
            totalWage += empWage;
            System.out.println("Emp Wage:" + empWage);
            totalWorkingDays++;
        }

        System.out.println("Total Days:" + totalWorkingDays);
        System.out.println("Total Hrs:" + totalWorkingHours);
        System.out.println("Total Wage:" + totalWage);
    }

}