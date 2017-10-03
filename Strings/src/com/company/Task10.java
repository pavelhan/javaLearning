package com.company;

public class Task10 {
    //10. Дана строка, содержащая полное имя файла. Выделить из этой строки название первого каталога (без символов «\»).
    // Если файл содержится в корневом каталоге, то вывести символ «\».
    // Выделить из этой строки расширение файла (без предшествующей точки).

    public static void main(String[] args) {
        String s = "C:\\\\jI_practice_00.txt";

        String [] folders = s.split("\\\\");

        if(!(folders.length > 3)) {
            System.out.println("\\");
        }

        String [] fileExtension = folders[folders.length-1].split("\\.");
        System.out.println(fileExtension[1]);
    }
}
