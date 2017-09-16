

public class HomeTask1 {

    public static void main(String[] args) {

    	
    	
    	
    	/*Part0
    	Task1
    	1. ���������, �������� �� ����������� �� ��������� �,�,�  �������������.*/
    	System.out.println("Part0.Task1");
    	int aL = 10;
    	int bL = 20;
    	int cL = 30;
    	boolean isRectangular = (cL*cL == (aL*aL + bL*bL));
    	if(isRectangular)
    	System.out.println("�������������");
    	else
    	System.out.println("�� �������������");
    	
    	
    	

    	//Part1
        //1
        int a = 10;
        int b = 20;
        int s = a*b;
        System.out.println("Taks1");
        System.out.println("Task1 "+s);

        //2
        double L;
        double S;
        int R = 56;
        double pi = 3.14;
        
        System.out.println("Task2");
        System.out.println("L="+2*pi*R);
        System.out.println("S="+(pi*(R*R)));

        //3
        int i = 4;
        int f = 7;
        
        System.out.println("Task3");
        System.out.println(i+f/2);


        //4 ���� ��� ��������������� ����� a � b. 
        //����� �� ������� ��������������, �� ���� ���������� ������ �� �� ������������.

        int a1 = 2;
        int b1 = 4;
        
        
        System.out.println("Task4");
        System.out.println(Math.sqrt(a1*b1));
        
        
        /*5. ����� ���������� ����� ����� ������� � ��������� ������������ x1 � x2
         *  �� �������� ���: |x2 � x1|.
         * */

        System.out.println("Task5");
        int x1 = 45;
        int x2 = -10;
        System.out.println("���������� �� ������ "+Math.abs(x2-x1));
        
        
        /*6. ���� ���������� ���� ��������������� ������ ��������������: (x1, y1), (x2, y2). 
         * ������� �������������� ����������� ���� ���������. 
         * ����� �������� � ������� ������� ��������������.
         * */
        
        int aX = 1;
        int aY = 7;
        int bX = 2;
        int bY = 9;
        
        int aLengh = bX - aX;
        int bLengh = bY - aY;
        System.out.println("Task6");
        System.out.println("������ ������� � = "+ aLengh);
        System.out.println("������ ������� b = "+ bLengh);
        System.out.println("�������� �������������� = "+ 2*(aLengh+bLengh));
        System.out.println("������� = "+aLengh*bLengh );
        
        /*7. ���� ���������� A, B, C. �������� �� ��������, ���������� ���������� A � B,
         *  B � � C, C � � A, � ������� ����� �������� ���������� A,B, C.
         * 
         * */
        
        int A = 1;
        int B = 2;
        int C = 3;
        /*int D;
        
        D = C;
        
        C = B;
        B = A;
        A = D;
        */
        
        
        System.out.println("Task7");
        System.out.println(A+" "+B+" "+C);
        
        
        //Part 2

        //Task1
        int e1 = -4;
        boolean t1 = e1 > 0;
        System.out.println(t1);

        //Task2
        int d1 = 6;
        boolean r2 = d1%2==0;
        System.out.println(r2+"������");
    }


    /*1. Дано целое число A. Проверить истинность высказывания: «Число A является положительным»
    * */
    int Num = -9;

    boolean isPositive = Num > 0;

    System.out.println(isPositive);



}
