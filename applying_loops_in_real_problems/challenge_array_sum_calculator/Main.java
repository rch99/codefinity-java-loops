package com.example;

public class Main {
    public static int sumHighValueItems(int[] prices) {
         int total = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > 10) {
                total += prices[i];
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] prices = {5, 12, 8, 20, 3, 15};
        int result = sumHighValueItems(prices);
        System.out.println("Sum of high value items: " + result);
    }
}