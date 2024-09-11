package com.bridgelabz.employeewage;

public class Main {
    public static void main(String[] args) {
        EmployeeWageManager wageManager = new EmployeeWageManager();

        wageManager.addCompany("Company A", 20, 2, 10);
        wageManager.addCompany("Company B", 25, 3, 15);
        wageManager.addCompany("Company C", 30, 4, 20);

        wageManager.displayAllCompanyWages();
    }
}
