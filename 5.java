import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("X: ");
        int x = scanner.nextInt();
        int a= 0;
        while(x>0)
        {
            a=a*10+x%10;
            x/=10;
        }
        while(a>0)
        {
            System.out.print(a%10+ ' ');
            a/=10;
        }
        scanner.close();
    }
}