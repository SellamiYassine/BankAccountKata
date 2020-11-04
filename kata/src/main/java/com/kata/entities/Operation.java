package com.kata.entities;


import com.kata.enums.OperationType;

import java.time.LocalDateTime;

public class Operation {

    private OperationType operationType;

    private LocalDateTime dateOperation;

    private int amount;

    private double balance;

    public OperationType getOperationType() {
        return operationType;
    }

    public LocalDateTime getDateOperation() {
        return dateOperation;
    }

    public int getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }


    public Operation(OperationType operationType, LocalDateTime dateOperation, int amount, double balance) {
        this.operationType = operationType;
        this.dateOperation = dateOperation;
        this.amount = amount;
        this.balance = balance;
    }
}
