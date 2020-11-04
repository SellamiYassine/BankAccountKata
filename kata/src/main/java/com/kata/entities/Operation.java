package com.kata.entities;


import com.kata.enums.OperationType;

import java.time.LocalDateTime;

public class Operation {

    private OperationType operationType;

    private LocalDateTime dateOperation;

    private double amount;

    private double balance;

    public OperationType getOperationType() {
        return operationType;
    }

    public LocalDateTime getDateOperation() {
        return dateOperation;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }


    public Operation(OperationType operationType, LocalDateTime dateOperation, double amount, double balance) {
        this.operationType = operationType;
        this.dateOperation = dateOperation;
        this.amount = amount;
        this.balance = balance;
    }
}
