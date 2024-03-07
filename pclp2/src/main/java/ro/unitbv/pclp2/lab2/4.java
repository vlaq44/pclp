import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        scanner.close();
        
        int s = a + b;
        int dif = a - b;
        int p = a * b;
        double medie = (double) (a + b) / 2;
        int dist = Math.abs(a - b);
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        System.out.println("Suma: " + s);
        System.out.println("Diferenta: " + dif);
        System.out.println("Produs: " + p);
        System.out.println("Medie: " + medie);
        System.out.println("Distanta: " + dist);
        System.out.println("Maxim: " + max);
        System.out.println("Minim: " + min);
    }
}