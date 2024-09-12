package com.bridgelabz.employeewage;

public class Main {
    public static void main(String[] args) {
        EmployeeWageManager wageManager = new EmployeeWageManager(3);

        wageManager.addCompany("Company A", 20, 2, 10);
        wageManager.addCompany("Company B", 25, 3, 15);
        wageManager.addCompany("Company C", 30, 4, 20);

        wageManager.addCompany("Company D", 40, 5, 20);
        wageManager.displayAllCompanyWages();
    }
}
