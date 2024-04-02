package ro.unitbv.pclp2.lab6;

public class Numar {
    int nr;

    public Numar(int n) {
        this.nr = n;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }

    public int suma(int a) {
        return nr + a;
    }

    public int suma(int a, int b) {
        return nr + a + b;
    }

    public int suma(int a, int b, int c) {
        return nr + a + b + c;
    }

    public int suma(int a, int b, int c, int d) {
        return nr + a + b + c + d;
    }
    public static void main(String[] args) {
        Numar numar = new Numar(5);
        System.out.println("Suma cu un parametru: " + numar.suma(3));
        System.out.println("Suma cu doi parametri: " + numar.suma(3, 4));
        System.out.println("Suma cu trei parametri: " + numar.suma(3, 4, 2));
        System.out.println("Suma cu patru parametri: " + numar.suma(3, 4, 2, 1));
    }
}
