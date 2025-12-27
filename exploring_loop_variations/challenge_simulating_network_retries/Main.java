package com.example;

public class Main {

    public static void simulateNetworkRequestRetry(int maxAttempts) {
        int attempt = 1;
        do {
            System.out.println("Attempt " + attempt + ": Connecting to server...");
            // Simulating failure (no actual network code)
            attempt++;
        } while (attempt <= maxAttempts);
        System.out.println("All attempts failed. Please try again later.");
    }

    public static void main(String[] args) {
        int maxAttempts = 5; // Example: passing 5 attempts
        simulateNetworkRequestRetry(maxAttempts);
    }
}