package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Payments> payments = new ArrayList<Payments>();
        int suffics = 1;


        for (int i = 0; i<5; i++) {
            try ( ObjectInputStream in = new ObjectInputStream(new FileInputStream("ukrtelecom" + suffics++ + ".dat"))) {
                Payments payment = (Payments) in.readObject();
                payment.setCheckNumber();
                payments.add(payment);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }
        for (Payments p: payments
             ) {
            System.out.println(p.toString());

        }


    }
}
