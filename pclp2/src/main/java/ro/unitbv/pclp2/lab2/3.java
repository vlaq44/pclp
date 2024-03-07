import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        double x = scanner.nextDouble();
        double patrat = Math.pow(x, 2);
        double cub = Math.pow(x, 3);
        double aPatraPutere = Math.pow(x, 4);
        System.out.printf("Patrat: %.2f\n", patrat);
        System.out.printf("Cub: %.2f\n", cub);
        System.out.printf("A 4-a putere: %.2f\n", aPatraPutere);

        scanner.close();
    }
}