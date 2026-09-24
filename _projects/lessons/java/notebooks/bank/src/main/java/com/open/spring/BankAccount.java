package com.open.spring;

public class BankAccount
{
    public static final int MAX_BALANCE = 1000;

    // TODO 1:
    // Declare a private static variable that tracks
    // how many Bank objects have been created

    // TODO 2:
    // Declare a private static variable that tracks
    // the total combined balance score by ALL accounts

    private String username;
    private int balance;

    // Create a bank account for a user
    public BankAccount(String name) {
        username = name;
        balance = 0;

        // TODO 3:
        // Update the appropriate class variable
    }

    public void deposit(int amount) {
        // TODO 4:
        // Add amount to user's balance
        //
        // Also update the appropriate class variable
    }

    public int getBalance() {
        // TODO 5:
        // Return the user's balance

        return 0;
    }

    public String getUsername() {
        // TODO 6:
        // Return the account's username

        return "";
    }

    public void resetBalance() {
        // TODO 7:
        // Reset this user's balance
        //
        // Remember that the class variable tracking
        // total points must also be updated
    }

    // CLASS METHODS
    public static int getUserCount() {
        // TODO 8:
        // Return the appropriate class variable

        return 0;
    }

    // balance of all accounts
    public static int getTotalBalance() {
        // TODO 9:
        // Return the appropriate class variable

        return 0;
    }

    public static void printAccount(BankAccount account) {
        // TODO 10:
        // Use the parameter the print the user's name
        // and balance
        // Account: <name>
        // Balance: <balance>
    }

    public static Double getPercentOfMax(BankAccount account) {
        // TODO 11:
        // Calculate and return the account's balance
        // as a percentage of MAX_BALANCE

        return 0.0;
    }

    public static boolean hasReachedMax(BankAccount account) {
        // TODO 12:
        // Return true if this account's balance is greater
        // than or equal to MAX_BALANCE

        return false;
    }
}
