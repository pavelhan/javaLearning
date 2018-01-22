package com.company;

import java.io.Serializable;

public class Payments implements Serializable{
    int customerNumber;
    String paymentDate;
    double amount;

    public static final long serialVersionUID = 1L;

    public Payments(int customerNumber, String paymentDate, double amount) {
        this.customerNumber = customerNumber;
        this.paymentDate = paymentDate;
        this.amount = amount;
    }
}
