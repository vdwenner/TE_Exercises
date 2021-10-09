package com.techelevator;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String accountHolder, int balance) {
        super(accountHolder, accountNumber, balance);
    }

    public SavingsAccount(String accountNumber, String accountHolder) {
        super(accountHolder, accountNumber);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        if (getBalance() - amountToWithdraw >= 2) {
            super.withdraw(amountToWithdraw);
            if (getBalance() < 150) {
                super.withdraw(2);
            }
        }
        return getBalance();
    }
}
