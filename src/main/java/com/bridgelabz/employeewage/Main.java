package com.bridgelabz.employeewage;

public class Main {
    public static void main(String[] args) {

        EmployeeWageCalculator emp1 = new EmployeeWageCalculator(20, 2, 10);
        emp1.computeEmpWage();

        EmployeeWageCalculator emp2 = new EmployeeWageCalculator(25, 3, 15);
        emp2.computeEmpWage();
    }
}
