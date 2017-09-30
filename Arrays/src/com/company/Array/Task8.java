package com.company.Array;

public class Task8 {
    public static void main(String[] args) {
        //8. Даны два массива A и B, элементы которых упорядочены по возрастанию. Объединить эти массивы так,
        // чтобы результирующий массив C остался упорядоченным по возрастанию.

        int[] A = {1, 2, 3, 4};
        int[] B = {5, 2, 2, 5};

        int[] C = new int[8];

        int smallest = 0;


        /*  for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }
        for (int k = 0; k < B.length; k++) {
            C[k+B.length] = B[k];
        }
        */

        System.arraycopy(A, 0, C,0, A.length);
        System.arraycopy(B, 0, C, 4, B.length);

        for (int i = 0; i < C.length; i++){
            int min = C[i];
            int imin = i;

            for (int d = i+1; d < C.length; d++){
                if (C[d]< min){
                    min = C[d];
                    imin = d;

                }
            }
            if (i != imin){
                int temp = C[i];
                C[i] = C[imin];
                C[imin] = temp;
            }
        }

        for (int count: C
                ) {
            System.out.println(count);
        }

    }
}