package com.bridgelabz.employeewage;

import org.w3c.dom.ls.LSOutput;

public class EmployeeWage {
    public static final int isPartTime =1;
    public static final int isFullTime =2;
    public static final int empRatePerHour=20;
    public static final int numOfWorking=2;
    public static final int MaxHrsPerMonth=10;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee problems");

            int empHrs=0;
            int totalEmpHrs=0;
            int totalWorkingDays=0;
            while(totalEmpHrs <= MaxHrsPerMonth && totalWorkingDays < numOfWorking) {
                totalWorkingDays++;
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

                totalEmpHrs=totalEmpHrs+empHrs;
                System.out.println("day#: "+totalWorkingDays+" Emp Hrours : "+empHrs);
            }
        int totalEmpWage=totalEmpHrs * empRatePerHour;
        System.out.println("Total Emp Wages : " + totalEmpWage);
    }
}
