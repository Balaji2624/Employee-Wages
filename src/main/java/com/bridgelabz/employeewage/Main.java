package com.bridgelabz.employeewage;

public class Main {
    public static void main(String[] args) {
        EmployeeWageManager wageManager = new EmployeeWageManager();

        wageManager.addCompany(new EmployeeWageCalculator("Company A", 20, 2, 10));  // $20 per hour, 2 working days, max 10 hours
        wageManager.addCompany(new EmployeeWageCalculator("Company B", 25, 3, 15));  // $25 per hour, 3 working days, max 15 hours
        wageManager.addCompany(new EmployeeWageCalculator("Company C", 30, 4, 20));

        wageManager.displayAllCompanyWages();
    }
}
