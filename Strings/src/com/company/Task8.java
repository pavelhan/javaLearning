package com.company;

public class Task8 {
    //8. Дана строка, состоящая из слов, разделенных пробелами (одним или несколькими). Вывести строку, содержащую эти же слова,
    // разделенные одним символом «.» (точка). В конце строки точку не ставить.

    public static void main(String[] args) {

        String s = "I want to sleep   at   home!";
        String newS = "";
        for (int i = 0; i < s.length(); i++){
            if (i != s.length()-1) {
                if (s.charAt(i) != ' ') {
                    newS += s.charAt(i);
                } else if (s.charAt(i) == ' ' & s.charAt(i-1) != ' ') {
                    newS += ".";
                }
            }

        }
        System.out.println(newS);
    }
}
