package ro.unitbv.pclp2.lab4;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int max,max2;
        int[] V = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            V[i] = scanner.nextInt();
        }
        max = max2 = V[0];
        for (int i = 0; i < n; i++) {
            {
                if(V[i] > max) {
                    max2=max;
                    max = V[i];
                }
            }
        }
        System.out.println("second max nr = "+max2);
    }
}