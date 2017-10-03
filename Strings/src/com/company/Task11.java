package com.company;

public class Task11 {

    //11. Дана строка-предложение на русском языке. Зашифровать её, выполнив циклическую замену каждой буквы на следующую
    // за ней в алфавите и сохранив при этом регистр букв («А» перейдет в «Б», «а» — в «б», «Б»— в «В», «я» — в «а» и т. д.).
    // Знаки препинания и пробелы не изменять.

    public static void main(String[] args) {

        String cryptedString = "я Нужно Зашифровать строку, которая задана тут.";

        char[] CryptedArray = cryptedString.toCharArray();

        for (int i = 0; i < CryptedArray.length; i++) {
            char a = CryptedArray[i];
            if (a != ' ' & a != ',' & a != '.') {
                if (a == 'Я'){
                    a = 'A';
                }else if (a == 'я'){
                    a = 'а';
                }else {
                    a++;
                }

                CryptedArray[i] = a;
            }
        }

        for (int i = 0; i < CryptedArray.length; i++) {
            System.out.print(CryptedArray[i]);
        }


    }
}
