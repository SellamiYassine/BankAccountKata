package com.kata;

import com.kata.entities.Account;

public class KataBankApplication {

    public static void main(String[] args) {

        Account account = new Account(1L,"1");
        account.deposit(1000);
        account.withdrawal(200);
        account.withdrawal(200);
        account.deposit(100);
        account.getAccountStatement();
        try {
            account.withdrawal(800);
        } catch (IllegalArgumentException bankAccountException) {
            System.out.println(bankAccountException.getMessage());
        }
    }

}
