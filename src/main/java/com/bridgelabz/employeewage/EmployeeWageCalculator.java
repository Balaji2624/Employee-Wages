package com.bridgelabz.employeewage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
interface EmployeeWageCalculatorInterface {
    void computeEmpWage();
    int getTotalEmpWage();
    void displayCompanyWage();
    String getCompanyName();
}
public class EmployeeWageCalculator implements EmployeeWageCalculatorInterface  {
        private String companyName;
        private int empRatePerHour;
        private int numOfWorkingDays;
        private int maxHrsInMonth;
        private int totalEmpWage;
        private int[] dailyWages;
        private int currentdayIndex;

        public EmployeeWageCalculator(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHrsInMonth) {
            this.companyName = companyName;
            this.empRatePerHour = empRatePerHour;
            this.numOfWorkingDays = numOfWorkingDays;
            this.maxHrsInMonth = maxHrsInMonth;
            this.totalEmpWage = 0;
            this.dailyWages = new int[numOfWorkingDays];
            this.currentdayIndex = 0;
        }

        public void computeEmpWage() {
            int empHrs = 0;
            int totalEmpHrs = 0;
            int totalWorkingDays = 0;
            while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numOfWorkingDays) {
                totalWorkingDays++;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;

                switch (empCheck) {
                    case 1: // Part-time
                        empHrs = 4;
                        break;

                    case 2: // Full-time
                        empHrs = 8;
                        break;

                    default:
                        empHrs = 0;
                }

                totalEmpHrs += empHrs;
                int dailyWage = empHrs * empRatePerHour;
                dailyWages[currentdayIndex++] = dailyWage;
                System.out.println("company name : "+companyName+" Day#: " + totalWorkingDays + " Emp Hrs: " + empHrs+" daily Wage : "+dailyWage);
            }

            int totalEmpWage = totalEmpHrs * empRatePerHour;
            System.out.println("Total Employee Wage for company " + companyName + " is: " + totalEmpWage);

        }
         public int getTotalEmpWage() {
           return totalEmpWage;
         }
        public String getCompanyName() {
          return companyName;
        }

        public void displayCompanyWage(){
            System.out.println("Company : "+companyName+" Total Employee Wage : "+totalEmpWage);
            System.out.println("Daily Wages: " + Arrays.toString(dailyWages));
        }



    }
class EmployeeWageManager {
    private EmployeeWageCalculatorInterface[] companyWageArray;
    private int numCompanies;

    public EmployeeWageManager(int totalCompanies) {
        companyWageArray = new EmployeeWageCalculatorInterface[totalCompanies];  // Initialize the array
        numCompanies = 0;
    }

    public void addCompany(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHrsInMonth) {
        if (numCompanies < companyWageArray.length) {
            EmployeeWageCalculator company = new EmployeeWageCalculator(companyName, empRatePerHour, numOfWorkingDays, maxHrsInMonth);
            company.computeEmpWage();
            companyWageArray[numCompanies] = company;
            numCompanies++;
        } else {
            System.out.println("Cannot add more companies. Array is full.");
        }
    }
    public void displayAllCompanyWages() {
        for (int i = 0; i < numCompanies; i++) {
            companyWageArray[i].displayCompanyWage();
        }
    }
    public int getTotalWageByCompany(String companyName) {
        for (int i = 0; i < numCompanies; i++) {
            if (companyWageArray[i].getCompanyName().equals(companyName)) {
                return companyWageArray[i].getTotalEmpWage();
            }
        }
        System.out.println("Company " + companyName + " not found.");
        return -1;
    }
}
