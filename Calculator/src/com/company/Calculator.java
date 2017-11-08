package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel mainPanel;
    private JButton clear;
    private JButton CE;
    private JButton C;
    private JButton plusMinus;
    private JButton Sqrt;
    private JButton digit7;
    private JButton digit4;
    private JButton digit1;
    private JButton digit0;
    private JButton decimalDelimiter;
    private JButton plus;
    private JButton calc;
    private JButton substruct;
    private JButton digit3;
    private JButton digit2;
    private JButton digit5;
    private JButton digit8;
    private JButton digit9;
    private JButton divide;
    private JButton percent;
    private JButton digit6;
    private JButton multiply;
    private JButton oneDivX;
    private JLabel Label;
    String userInput = "";
    String LabelView = "";
    public int firstNumber;
    public int secondNumber;
    public double result;
    public Operations operation;

    public Calculator() {
        digit1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setText(Label.getText() + "1");
                userInput+= digit1.getText();
                LabelView += Label.getText()+ digit1.getText();
            }
        });
        digit2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setText(Label.getText() + "2");
                userInput+= digit2.getText();
                LabelView += Label.getText()+ digit2.getText();
            }
        });

        //Plus operation
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Integer.parseInt(userInput);
                userInput = "";
                operation = Operations.Plus;
                Label.setText(Label.getText()+ "+");
            }
        });
        //Substract
        substruct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Integer.parseInt(userInput);
                userInput = "";
                operation = Operations.Substract;
                Label.setText(Label.getText()+ "-");
            }
        });

        //Calculate operation
        calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondNumber = Integer.parseInt(userInput);
                userInput = "";
                switch (operation){
                    case Plus:
                        result = firstNumber + secondNumber;
                        break;
                    case Divide:
                        result = firstNumber / secondNumber;
                        break;
                    case Multiple:
                        result = firstNumber * secondNumber;
                        break;
                    case Substract:
                        result = firstNumber - secondNumber;
                        break;
                }
                Label.setText(result+"");

            }
        });
        //Clear all
        C.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userInput = "";
                firstNumber = 0;
                secondNumber = 0;
                Label.setText("");
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setMinimumSize(new Dimension(500, 300));
        //frame.setMaximumSize(new Dimension(500,300));
        frame.setContentPane(new Calculator().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }


}
