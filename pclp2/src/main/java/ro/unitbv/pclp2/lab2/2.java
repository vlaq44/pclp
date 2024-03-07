import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int suma = 0;
        while(x>0)
        {
            suma+=x%10;
            x/=10;
        }
        System.out.print("Suma cifrelor este: " + suma);
        scanner.close();
    }
}