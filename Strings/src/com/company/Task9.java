package com.company;

public class Task9 {
    // 9. Дана строка-предложение. Вывести самое короткое слово в предложении. Если таких слов несколько, то вывести последнее из них.
    // Словом считать набор символов, не содержащий пробелов, знаков препинания и ограниченный пробелами, знаками препинания или началом/концом строки.

    public static void main(String[] args) {

        String s = "I love my, wife";

        String[] words = s.split(" |,");
        String smallWord = words[0];

        for (int i = 1; i < words.length - 1; i++) {
            if (!words[0].equals("")) {
                if (words[i].length() <= smallWord.length()) {
                    smallWord = words[i];
                }
            }
        }
        System.out.println(smallWord);
    }
}