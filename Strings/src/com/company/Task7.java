package com.company;

public class Task7 {
    public static void main(String[] args) {
        //7. Дана строка, содержащая по крайней мере один символ пробела.
        // Вывести подстроку, расположенную между первым и последним пробелом исходной строки.
        // Если строка содержит только один пробел, то вывести пустую строку

        String s = "I want to sleep at home!";
        int spacesCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                spacesCount++;
            }
        }
        int[] spacesIndexes = new int[spacesCount];
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                spacesIndexes[counter]=i;
                counter++;
            }
        }

        System.out.println("'" + s.substring(spacesIndexes[0]+1,spacesIndexes[spacesIndexes.length-1]) + "'");

    }
}
