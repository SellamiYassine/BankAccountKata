package com.kata.entities;

import com.kata.enums.OperationType;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Account {

    private Long id;

    private String clienId;

    private double balance = 0.0;

    private List<Operation> listOperation = new ArrayList<Operation>();


    public Account(Long id, String clienId) {
        this.id = id;
        this.clienId = clienId;
    }

    public double getBalance() {
        return balance;
    }

    public List<Operation> getListOperation() {
        return listOperation;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(Integer amount) throws IllegalArgumentException {

        if (amount == null) {
            throw new IllegalArgumentException("null value");
        }

        int compareToZero = Integer.signum(amount - 0);

        switch (compareToZero) {
            case -1: throw new IllegalArgumentException("cannot deposit negative amount");
            case 0:  throw new IllegalArgumentException("cannot deposit zero");
            case 1:
                this.setBalance(this.getBalance() + amount);
                Operation operation = new Operation(OperationType.DEPOSIT, LocalDateTime.now(),amount,this.getBalance());
                this.getListOperation().add(operation);
                break;
        }
    }

    public void withdrawal(int amount) throws IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("cannot withdrawal negative amount");
        } else if (amount > this.getBalance()) {
            throw new IllegalArgumentException("insufficient balance");
        } else {
            this.setBalance(this.getBalance() - amount);
            Operation operation = new Operation(OperationType.WITHDRAWAL, LocalDateTime.now(),amount,this.getBalance());
            this.getListOperation().add(operation);
        }
    }

}
