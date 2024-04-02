package ro.unitbv.pclp2.lab6;

class Fractie{
    private int numarator;
    private int numitor;
    public Fractie(int numarator, int numitor) {
        if (numitor == 0) {
            throw new IllegalArgumentException("Numitorul nu poate fi zero.");
        }
        this.numarator = numarator;
        this.numitor = numitor;
    }

    public Fractie() {
        this(0, 1);
    }

    public void setNumarator(int numarator) {
        this.numarator = numarator;
    }

    public void setNumitor(int numitor) {
        if (numitor == 0) {
            throw new IllegalArgumentException("Numitorul nu poate fi zero.");
        }
        this.numitor = numitor;
    }

    // Getters
    public int getNumarator() {
        return numarator;
    }

    public int getNumitor() {
        return numitor;
    }

    public Fractie aduna(Fractie frac) {
        int nouNumarator = this.numarator * frac.numitor + frac.numarator * this.numitor;
        int nouNumitor = this.numitor * frac.numitor;
        return simplifica(new Fractie(nouNumarator, nouNumitor));
    }

    private Fractie simplifica(Fractie frac) {
        int cmmdc = cmmdc(frac.numarator, frac.numitor);
        frac.numarator /= cmmdc;
        frac.numitor /= cmmdc;
        return frac;
    }

    private int cmmdc(int a, int b) {
        while (b != 0) {
            int aux = b;
            b = a % b;
            a = aux;
        }
        return a;
    }

    @Override
    public String toString() {
        return numarator + "/" + numitor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Fractie frac = (Fractie) obj;
        return numarator == frac.numarator && numitor == frac.numitor;
    }

    public static void main(String[] args) {
        Fractie frac1 = new Fractie(1, 2);
        Fractie frac2 = new Fractie(1, 3);
        Fractie suma = frac1.aduna(frac2);
        System.out.println(frac1 + " + " + frac2 + " = " + suma);
        System.out.println("frac1 equals frac2: " + frac1.equals(frac2));
    }
}
