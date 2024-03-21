package ro.unitbv.pclp2.lab4;

import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] V = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            V[i] = scanner.nextInt();
        }
        for(int i = 0; i < n; i++)
            for(int j = i+1 ; j < n; j++)
            {
                if(V[i] == V[j])
                {
                    for(int k = j; k < n-1; k++)
                        V[k] = V[k+1];
                    n--;
                }
            }
        System.out.println("The array has " + n + " elements");
        for (int i = 0; i < n; i++) {
            System.out.print(V[i]+" ");
        }
    }
}
