package com.bridgelabz.employeewage;

public class Main {
    public static void main(String[] args) {

        EmployeeWageCalculator company1 = new EmployeeWageCalculator("Company A", 20, 2,10);
        company1.computeEmpWage();

        EmployeeWageCalculator company2 = new EmployeeWageCalculator("Company B", 25, 3,15);
        company2.computeEmpWage();
    }
}
