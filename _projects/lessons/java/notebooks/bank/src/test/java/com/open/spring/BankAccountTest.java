package com.open.spring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BankAccountTest
{

    @Test
    public void testAccountCount() {
        BankAccount a = new BankAccount("Alice");
        BankAccount b = new BankAccount("Bob");
        BankAccount c = new BankAccount("Charlie");

        assertEquals(3, BankAccount.getUserCount());
    }

    @Test
    public void testInitialBalance() {
        BankAccount acc = new BankAccount("Alice");

        assertEquals(0, acc.getBalance());
    }

    @Test
    public void testAccountNames() {
        BankAccount acc = new BankAccount("Alice");

        assertEquals("Alice", acc.getUsername());
    }

    @Test
    public void testDeposit() {
        BankAccount acc = new BankAccount("Alice");

        acc.deposit(25);
        acc.deposit(30);

        assertEquals(55, acc.getBalance());
    }

    @Test
    public void testTotalBalance() {
        BankAccount a = new BankAccount("Alice");
        BankAccount b = new BankAccount("Bob");

        a.deposit(20);
        b.deposit(30);

        assertEquals(50, BankAccount.getTotalBalance());
    }

    @Test
    public void testMultipleAccounts() {
        BankAccount a = new BankAccount("Alice");
        BankAccount b = new BankAccount("Bob");

        a.deposit(100);
        b.deposit(200);

        assertEquals(100, a.getBalance());
        assertEquals(200, b.getBalance());
    }

    @Test
    public void testResetBalance() {
        BankAccount acc = new BankAccount("Alice");

        acc.deposit(100);
        acc.resetBalance();

        assertEquals(0, acc.getBalance());
    }

    @Test
    public void testPercentOfMax() {
        BankAccount acc = new BankAccount("Alice");

        acc.deposit(250);

        double res = BankAccount.getPercentOfMax(acc);

        assertEquals(25.0, res);
    }

    @Test
    public void testHasReachedMax() {
        BankAccount acc = new BankAccount("Alice");

        acc.deposit(BankAccount.MAX_BALANCE);

        assertTrue(BankAccount.hasReachedMax(acc));
    }

    @Test
    public void testMaxScoreConstant() {
        assertEquals(1000, BankAccount.MAX_BALANCE);
    }
}
