package com.bridgelabz.employeewage;

import org.w3c.dom.ls.LSOutput;

public class EmployeeWage {
    public static final int isPartTime =1;
    public static final int isFullTime =2;
    public static final int empRatePerHour=20;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee problems");

            int empHrs=0;
            int empWage=0;
            int empCheck = (int)Math.floor(Math.random()*10)%3;
             switch (empCheck) {
                case isPartTime:
                   empHrs=4;
                   break;
                case isFullTime:
                   empHrs=8;
                   break;
                default:
                   empHrs=0;
             }
            empWage=empHrs*empRatePerHour;
            System.out.println("Emp Wages : "+empWage);
    }
}
