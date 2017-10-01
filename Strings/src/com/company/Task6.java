package com.company;
public class Task6 {
    public static void main(String[] args) {
        //6. Даны строки S и S0. Удалить из строки S все подстроки, совпадающие с S0. Если совпадающих подстрок нет, то вывести строку S без изменений
        StringBuffer S = new StringBuffer("Я люблю Яну");
        StringBuffer S0 = new StringBuffer("лю");
        for (int i = 0; i < S.length()- S0.length(); i++){
            String s3 = (S.substring(i,S0.length()+i));
            if (s3.equals(S0.toString())){
                S.delete(i,s3.length()+i);
            }
        }
        System.out.println(S);
    }
}
