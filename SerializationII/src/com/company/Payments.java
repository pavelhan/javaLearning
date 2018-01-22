package com.company;

import java.io.Serializable;
import java.util.Random;

public class Payments implements Serializable {
    int customerNumber;
    String paymentDate;
    double amount;
    String checkNumber;
    public static final long serialVersionUID = 1L;

    public Payments(int customerNumber, String paymentDate, double amount) {
        this.customerNumber = customerNumber;
        this.paymentDate = paymentDate;
        this.amount = amount;

    }


    public void setCheckNumber() {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        String rndString = "";
        Random rnd = new Random();
        int strLengh = rnd.nextInt(10*2);
        //System.out.println(strLengh);
        for (int i = 0; i< strLengh;i++){
            rndString += chars[rnd.nextInt(7)];
        }
        this.checkNumber =  rndString;

    }


    @Override
    public String toString() {
        return "Payments{" +
                "customerNumber=" + customerNumber +
                ", paymentDate='" + paymentDate + '\'' +
                ", amount=" + amount +
                ", checkNumber=" + checkNumber +
                '}';
    }
}
