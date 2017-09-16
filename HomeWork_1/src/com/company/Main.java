package com.company;

public class Main {

    public static void main(String[] args) {




    	/*Part0
        Task1
    	1. Проверить, является ли треугольник со сторонами а,в,с  прямоугольным.*/
        System.out.println("Part0.Task1");
        int aL = 10;
        int bL = 20;
        int cL = 30;
        boolean isRectangular = (cL * cL == (aL * aL + bL * bL));
        if (isRectangular)
            System.out.println("прямоугольный");
        else
            System.out.println("не прямоугольный");


        //Part1
        //1 Даны стороны прямоугольника a и b. Найти его площадь S = a•b и периметр P = 2•(a + b)
        int a = 10;
        int b = 20;
        int s = a * b;
        System.out.println("Taks1");
        System.out.println("Task1 " + s);

        //2 Найти длину окружности L и площадь круга S заданного радиуса R: L = 2*pi*R,      S = pi•R2. В качестве значения pi использовать 3.14.
        double L;
        double S;
        int R = 56;
        double pi = 3.14;

        System.out.println("Task2");
        System.out.println("L=" + 2 * pi * R);
        System.out.println("S=" + (pi * (R * R)));

        //3 Даны два числа a и b. Найти их среднее арифметическое: (a + b)/2.
        int i = 4;
        int f = 7;

        System.out.println("Task3");
        System.out.println(i + f / 2);


        //4 Даны два неотрицательных числа a и b. Найти их среднее геометрическое, то есть квадратный корень из их произведения.

        int a1 = 2;
        int b1 = 4;


        System.out.println("Task4");
        System.out.println(Math.sqrt(a1 * b1));


        /*5. Найти расстояние между двумя точками с заданными координатами x1 и x2 на числовой оси: |x2 – x1|.*/

        System.out.println("Task5");
        int x1 = 45;
        int x2 = -10;
        System.out.println("Расстояние между двумя точками с заданными координатами x1 и x2 " + Math.abs(x2 - x1));


        /*6. Даны координаты двух противоположных вершин прямоугольника: (x1, y1), (x2, y2). Стороны прямоугольника параллельны осям координат. Найти периметр и площадь данного прямоугольника.*/

        int aX = 1;
        int aY = 7;
        int bX = 2;
        int bY = 9;

        int aLengh = bX - aX;
        int bLengh = bY - aY;
        System.out.println("Task6");
        System.out.println("Длинна а = " + aLengh);
        System.out.println("Длинна b = " + bLengh);
        System.out.println("периметр = " + 2 * (aLengh + bLengh));
        System.out.println("площадь = " + aLengh * bLengh);

        /*7. Даны переменные A, B, C. Изменить их значения, переместив содержимое A в B, B — в C, C — в A, и вывести новые значения переменных A,B, C.*/

        int A = 1;
        int B = 2;
        int C = 3;
        int D;

        D = C;

        C = B;
        B = A;
        A = D;


        System.out.println("Task7");
        System.out.println(A + " " + B + " " + C);


        //Part 2

        //1. Дано целое число A. Проверить истинность высказывания: «Число A является положительным»

        int Num = -9;

        boolean isPositive = Num > 0;
        System.out.println("Taks1");
        System.out.println(isPositive);

        /*2. Дано целое число A. Проверить истинность высказывания: «Число A является нечетным».*/
        int Num2 = 7;

        boolean isPair = Num2 % 2 == 0;
        System.out.println("Task2");
        System.out.println(isPair);

        /*3. Даны три целых числа: A, B, C. Проверить истинность высказывания: «Справедливо двойное неравенство A < B < C».
        * */

        int A1 = 1;
        int B2 = 2;
        int C3 = 3;

        System.out.println("Taks3");
        boolean xxx = (A < B) & (B < C);
        System.out.println(xxx);


        /*4. Даны три целых числа: A, B, C. Проверить истинность высказывания: «Хотя бы одно из чисел A, B, C положительное».

        * */
        int F1 = 0;
        int F2 = 5;
        int F3 = -6;

        System.out.println("Task 4.");
        boolean oneNumPositive = (A | B | C) > 0;
        System.out.println(oneNumPositive);

        /*5. Даны три целых числа: A, B, C. Проверить истинность высказывания: «Ровно одно из чисел A, B, C положительное».
        * */

        int T1 = 1;
        int T2 = -5;
        int T3 = -10;
        System.out.println("Task5");
        boolean onlyOnePositive = (T1 < 0 & T2 < 0 & T3 > 0) | (T1 > 0 & T2 > 0 & T3 < 0) | (T1 > 0 & T2 < 0 & T3 < 0);
        System.out.println(onlyOnePositive);

        /*6. Дано целое положительное число. Проверить истинность высказывания: «Данное число является нечетным трехзначным».
        * */

        int Y = 101;
        System.out.println("Task6");
        boolean isIntPair = ((Y > 99) & (Y < 1000)) & ((Y % 2 != 0));
        System.out.println(isIntPair);

        /*7.Даны числа x, y, x1, y1, x2, y2. Проверить истинность высказывания:«Точка с координатами (x, y)
        лежит внутри прямоугольника, левая верхняя вершина которого имеет координаты (x1, y1), правая нижняя — (x2, y2),
        а стороны параллельны координатным осям».
        */

        int XX = 1; // точка в пространстве
        int YY = 3;

        int XX1 = 3; //левая верхняя точка прямоугольника
        int YY1 = 5;

        int XX2 = 9; //правая нижняя точка прямоугольника
        int YY2 = 2;





        boolean isXXinRectangle = ((XX >= XX1 & XX <= XX2)) & ((YY <= YY1 & YY >= (YY1 - YY2)));
        System.out.println("Task 7.");
        System.out.println("Находится ли точка в прямоугольнике?" + "\n" + isXXinRectangle);


        /*8. Даны целые числа a, b, c. Проверить истинность высказывания: «Существует треугольник со сторонами a, b, c».*/

        int T = 2;
        int O = 2;
        int P = 3;


        boolean isTrianglePresent = (T + O > P);
        System.out.println("Task8");
        System.out.println("Существует ли триугольник со сторонами " + T +" "+ O + " " + P);
        System.out.println(isTrianglePresent);


        /*9. Даны координаты поля шахматной доски x, y (целые числа, лежащие в диапазоне 1–8). Учитывая,
        что левое нижнее поле доски (1, 1) является черным, проверить истинность высказывания: «Данное поле является белым».*/

        int Xchess = 4;
        int Ychess = 5;

        boolean isFieldWhite = (Xchess % 2 ==0 & Ychess%2 > 0) | (Ychess % 2 ==0 & Xchess%2 > 0);
        System.out.println("Task9");
        System.out.println("Поле белое?"+ "\n"+ isFieldWhite);


        /*10. Даны координаты двух различных полей шахматной доски x1, y1, x2, y2 (целые числа, лежащие в диапазоне 1–8).
        Проверить истинность высказывания: «Ферзь за один ход может перейти с одного поля на другое».*/


        int X1chess = 3;
        int Y1chess = 4;

        int X2chess = 5;
        int Y2chess = 3;


        boolean canQueenMoveStrait = ((X2chess >= X1chess  | X2chess <= X1chess) & (Y2chess == Y1chess)) | ((Y2chess >= Y1chess  | Y2chess <= Y1chess) & (X2chess == X1chess));
        boolean canQueenMoveByDiagonally = (X2chess-X1chess == Y2chess-Y1chess);
        boolean canQueenMoveToItSelf = (X1chess == X2chess & Y1chess == Y2chess);
        boolean canQueenMove = (canQueenMoveStrait | canQueenMoveByDiagonally) & canQueenMoveToItSelf == false;
        System.out.println("Task10");
        System.out.println("Ферзь может походить?"+ "\n" + canQueenMove);

        /*11. Даны два числа А и В. Поменяйте их местами не используя дополнительную переменную и арифметические операции*/



    }
}
