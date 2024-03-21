package ro.unitbv.pclp2.lab4;
import java.util.Random;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n;
        System.out.println("Enter square matrix size: ");
        n = scanner.nextInt();
        int[][] A = new int[n][n];
        System.out.println("The matrix is: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                A[i][j] = random.nextInt(100);
                System.out.print(A[i][j] + " ");
            }System.out.print("\n");
        }
        int sum=0;
        for(int i = 0; i < n; i++)
            sum+=A[i][i];
        System.out.println("The trace sum is: "+sum);
    }
}
