package com.kata.entities;

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

}
