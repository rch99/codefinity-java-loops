package com.example;

public class Main {
    public static double calculateTotalExpenses(double[] expenses) {
        double total = 0.0;
        for (int i = 0; i < expenses.length; i++) {
            total += expenses[i];
        }
        return total;
    }

    public static void main(String[] args) {
        double[] expenses = {12.5, 8.0, 15.75, 9.2, 11.0, 7.3, 13.6};
        double total = calculateTotalExpenses(expenses);
        System.out.println("Total expenses for the week: $" + total);
    }
}