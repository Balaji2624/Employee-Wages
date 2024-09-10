package com.bridgelabz.employeewage;

import org.w3c.dom.ls.LSOutput;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee problems");
            int isFullTime = 2;
            int isPartTime = 1;
            int empRatePerHour = 20;
            int empHrs=0;
            int empWage=0;
            double empCheck = Math.floor(Math.random()*10)%3;
            if(empCheck==isFullTime)
            {
                empHrs=8;
                System.out.println("Employee is Present..");
            }else if(empCheck==isPartTime)
            {
                empHrs=4;
            }
            else{
                empHrs=0;
                System.out.println("Employee is Absent");
            }
            empWage=empHrs*empRatePerHour;
            System.out.println("Emp Wages : "+empWage);
    }
}
