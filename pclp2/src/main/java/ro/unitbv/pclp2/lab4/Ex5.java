package ro.unitbv.pclp2.lab4;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m, o = 0, k = 0;
        boolean check;
        System.out.print("Enter the size of array A: ");
        n = scanner.nextInt();
        System.out.print("Enter the size of array B: ");
        m = scanner.nextInt();
        int[] A = new int[n], B = new int[m], C = new int[n];
        System.out.print("Enter the " + n + " elements of array A: ");
        for (int i = 0; i < n; i++)
            A[i] = scanner.nextInt();
        System.out.print("Enter the " + m + " elements of array B: ");
        for (int i = 0; i < m; i++)
            B[i] = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            check = false;
            for (int j = 0; j < m; j++) {
                if (A[i] == B[j]) {
                    check = true;
                    break;
                }
            }
            if (check) {
                boolean alreadyAdded = false;
                for (int l = 0; l < o; l++) {
                    if (C[l] == A[i]) {
                        alreadyAdded = true;
                        break;
                    }
                }
                if (!alreadyAdded) {
                    C[o] = A[i];
                    o++;
                }
            }
        }
        System.out.println("Number of common elements: " + o);
        System.out.println("The common elements between the two arrays are: ");
        for (int i = 0; i < o; i++)
            System.out.print(C[i] + " ");
    }
}