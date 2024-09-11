package com.bridgelabz.employeewage;

    public class EmployeeWageCalculator {
        private String companyName;
        private int empRatePerHour;
        private int numOfWorkingDays;
        private int maxHrsInMonth;

        public EmployeeWageCalculator(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHrsInMonth) {
            this.companyName = companyName;
            this.empRatePerHour = empRatePerHour;
            this.numOfWorkingDays = numOfWorkingDays;
            this.maxHrsInMonth = maxHrsInMonth;
        }

        public int computeEmpWage() {
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
                System.out.println("company name : "+companyName+" Day#: " + totalWorkingDays + " Emp Hrs: " + empHrs);
            }

            int totalEmpWage = totalEmpHrs * empRatePerHour;
            System.out.println("Total Emp Wage for company " + totalWorkingDays + " days: " + totalEmpWage);
            return totalEmpWage;
        }

    }
