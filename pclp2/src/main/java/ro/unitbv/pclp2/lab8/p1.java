package ro.unitbv.pclp2.lab8;

public class p1 {

        public static void main(String[] args) {
            try {
                int numerator = 10;
                int denominator = 0;
                int result = numerator / denominator;

                System.out.println("Rezultatul împărțirii este: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Eroare: Împărțire la zero!");
                e.printStackTrace(); // afișează detalii despre excepție
            }
        }


}
