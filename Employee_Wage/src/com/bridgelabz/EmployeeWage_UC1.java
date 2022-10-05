package com.bridgelabz;

public class EmployeeWage_UC1 {
    public static void main(String[] args) {
        System.out.println("Attendance");
        int Attendance = 1;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == Attendance)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}

