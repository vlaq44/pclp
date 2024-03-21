package ro.unitbv.pclp2.lab4;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] A = new int[3][4], B = new int[3][4];
        System.out.println("Enter the elements of matrix A: ");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 4; j++) {
                A[i][j] = scanner.nextInt();
            }
        System.out.println("Enter the elements of matrix B: ");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 4; j++)
                B[i][j] = scanner.nextInt()+A[i][j];
        System.out.println("The two matrixes added equals: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}