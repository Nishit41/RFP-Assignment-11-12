package com.bridgelabz;


  import java.util.Scanner;

    public class AccountTesting extends Account{
        public static void main(String[] args) {
            AccountTesting test = new AccountTesting();
            Scanner scr = new Scanner(System.in);
            System.out.println("Enter the account balance");
            int accountBalance= scr.nextInt();
            test.debit(accountBalance);
        }
    }

