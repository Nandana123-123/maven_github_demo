package com.example.maven_github_demo;


import java.util.Scanner;

public class ElectricityBillCalculator {

    public double calculateBill(int units) {

        if (units < 0) {
            throw new IllegalArgumentException("Invalid units");
        }

        double bill = 0;

        if (units <= 100) {
            bill = units * 1.50;
        }
        else if (units <= 200) {
            bill = (100 * 1.50)
                    + (units - 100) * 2.50;
        }
        else if (units <= 500) {
            bill = (100 * 1.50)
                    + (100 * 2.50)
                    + (units - 200) * 4.00;
        }
        else {
            bill = (100 * 1.50)
                    + (100 * 2.50)
                    + (300 * 4.00)
                    + (units - 500) * 6.00;
        }

        return bill + 50;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ElectricityBillCalculator obj =
                new ElectricityBillCalculator();

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        try {
            double amount = obj.calculateBill(units);

            System.out.println("Units: " + units);
            System.out.printf("Final Electricity Bill: Rs. %.2f%n",
                    amount);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
