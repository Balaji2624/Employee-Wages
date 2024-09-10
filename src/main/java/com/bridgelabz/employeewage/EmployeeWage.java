package com.bridgelabz.employeewage;

import org.w3c.dom.ls.LSOutput;

public class EmployeeWage {
    public static final int isPartTime =1;
    public static final int isFullTime =2;
    public static final int empRatePerHour=20;
    public static final int numOfWorking=2;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee problems");

            int empHrs=0;
            int empWage=0;
            int totalEmpWage=0;
            for(int day=0;day<numOfWorking;day++) {
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
                    case isPartTime:
                        empHrs = 4;
                        break;
                    case isFullTime:
                        empHrs = 8;
                        break;
                    default:
                        empHrs = 0;
                }

                empWage = empHrs * empRatePerHour;
                totalEmpWage = totalEmpWage + empWage;
                System.out.println("Emp Wages : " + empWage);
            }
        System.out.println("Total Emp Wages : " + totalEmpWage);
    }
}
