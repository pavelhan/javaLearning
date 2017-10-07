package com.company;

import java.util.Scanner;

public class Task12 {

    //12. Напишите транслитератор с кириллицы в латиницу и наоборот. Ввод строк осуществляется с клавиатуры.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] rus = {"щ", "ш", "ц", "а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф", "х", "ч", "ы", "ь", "э", "ю", "я"};
        String[] eng = {"shch", "sh", "tc", "a", "b", "v", "g", "d", "ye", "yo", "zh", "z", "i", "i", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "kh", "ch", "y", "'", "e", "iu", "ia"};
        String phraze = sc.nextLine();
        String tranlittedLine = "";
        for (int i = 0; i < phraze.length(); i++) {
            for (int j = 0; j < rus.length; j++) {
                if (rus[j].equals(phraze.charAt(i) + "")) {
                    tranlittedLine += eng[j];
                }
            }
        }
        System.out.println(tranlittedLine);

        String translittedLineToRus = "";
        for (int i = 0; i < tranlittedLine.length(); ) {
            for (int j = 0; j < eng.length; j++) {
                if (tranlittedLine.length() - i >= 4 && tranlittedLine.substring(i, i + 4).equals(eng[j])) {
                    translittedLineToRus += rus[j];
                    System.out.println("4 nashel " + tranlittedLine.substring(i, i + 4) + "  :  " + i);
                    i = i + 4;
                    break;
                } else if (tranlittedLine.length() - i >= 3 && tranlittedLine.substring(i, i + 3).equals(eng[j])) {
                    translittedLineToRus += rus[j];

                    System.out.println("3 nashel " + tranlittedLine.substring(i, i + 3) + "  :  " + i);
                    i = i + 3;
                    break;
                } else if (tranlittedLine.length() - i >= 2 && tranlittedLine.substring(i, i + 2).equals(eng[j])) {
                    translittedLineToRus += rus[j];

                    System.out.println("2 nashel " + tranlittedLine.substring(i, i + 2) + "  :  " + i);
                    i = i + 2;
                    break;
                }
//                else if (tranlittedLine.length() - i >= 1 && tranlittedLine.substring(i, i + 1).equals(eng[j])){
//                    translittedLineToRus += rus[j];
//
//                    System.out.println("1 nashel " + tranlittedLine.substring(i, i + 1) + "  :  " + i);
//                    i=i+2;
//                }
                else if ((tranlittedLine.charAt(i) + "").equals(eng[j])) {
                    translittedLineToRus += rus[j];

                    System.out.println("0 nashel " + tranlittedLine.charAt(i) + "  :  " + i);
                    i = i + 1;
                    break;
                }
            }
            //System.out.println("Test");
        }
        System.out.println(translittedLineToRus);
    }
}

