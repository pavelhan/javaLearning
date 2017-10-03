package com.company;

import java.util.Scanner;

public class Task12 {

    //12. Напишите транслитератор с кириллицы в латиницу и наоборот. Ввод строк осуществляется с клавиатуры.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] rus = {"а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф", "х", "ц", "ч", "ш", "щ", "ы", "э", "ю", "я"};
        String[] eng = {"a", "b", "v", "g", "d", "e", "e", "zh", "z", "i", "i", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "kh", "tc", "ch", "sh", "shch", "y", "e", "iu", "ia"};
        String[] string = sc.nextLine().split(" ");

        for (int i = 0; i < string.length; i++) {
            char [] word = string[i].toCharArray();
            for (int j = 0; j < word.length; j++) {
                for (int letter = 0; letter < rus.length; letter++){
                    if ((word[j]) == rus[letter]){
                        word[j] = eng[letter];
                    }
                }
            }
        }


    }
}
