package com.bridgelabz.objectOriented;
import java.util.Scanner;

public class Account {
    private double accountBal;
    private double debitAmt;
    Scanner sc = new Scanner(System.in);

    public double getAccountBal() {
        return accountBal;
    }
    public void setAccountBal(double accountBal) {
        this.accountBal = accountBal;
    }
    public double getDebitAmt() {
        return debitAmt;
    }
    public void setDebitAmt(double debitAmt) {
        this.debitAmt = debitAmt;
    }

    public void credit() {
        System.out.println("Enter the Account Balance: ");
        setAccountBal(sc.nextDouble());
    }

    public void debit() {
        System.out.println("Enter the withdrawal amount: ");
        setDebitAmt(sc.nextDouble());

        if (accountBal > debitAmt) {
            accountBal = accountBal - debitAmt;
            System.out.println("Money has Withdrawn , Remaining Balance Rs."+accountBal);
            System.out.println(" ");

        }
        else if(accountBal == debitAmt) {
            accountBal = 0;
            System.out.println("No Money Left !!! "+ accountBal);
        }
        else {
            accountBal = getAccountBal();
            System.out.println("Not enough Balance, Amount exceeds the Account Balance");

        }
        System.out.println("Current Account Balance = " + accountBal);
    }

}
