package ro.unitbv.pclp2.lab9;

import java.util.*;

abstract class Vagon {
    abstract int getCapacitatePasageri();
    abstract int getCapacitateColetePostale();
    abstract void deschideUsi();
    abstract void inchideUsi();
    abstract void blocheazaGeamuri();
}

class CalatoriA extends Vagon {
    @Override
    int getCapacitatePasageri() {
        return 40;
    }

    @Override
    int getCapacitateColetePostale() {
        return 300;
    }

    @Override
    void deschideUsi() {
        System.out.println("Ușile vagonului de tip CalatoriA au fost deschise automat.");
    }

    @Override
    void inchideUsi() {
        System.out.println("Ușile vagonului de tip CalatoriA au fost închise automat.");
    }

    @Override
    void blocheazaGeamuri() {
        // Nu se face nimic, vagonul CalatoriA nu are serviciu de blocare a geamurilor
    }
}

class CalatoriB extends Vagon {
    @Override
    int getCapacitatePasageri() {
        return 50;
    }

    @Override
    int getCapacitateColetePostale() {
        return 400;
    }

    @Override
    void deschideUsi() {
        System.out.println("Ușile vagonului de tip CalatoriB au fost deschise automat.");
    }

    @Override
    void inchideUsi() {
        System.out.println("Ușile vagonului de tip CalatoriB au fost închise automat.");
    }

    @Override
    void blocheazaGeamuri() {
        System.out.println("Geamurile vagonului de tip CalatoriB au fost blocate automat.");
    }
}

class Marfa extends Vagon {
    @Override
    int getCapacitatePasageri() {
        return 0;
    }

    @Override
    int getCapacitateColetePostale() {
        return 400;
    }

    @Override
    void deschideUsi() {
        System.out.println("Ușile vagonului de tip Marfa au fost deschise manual.");
    }

    @Override
    void inchideUsi() {
        System.out.println("Ușile vagonului de tip Marfa au fost închise manual.");
    }

    @Override
    void blocheazaGeamuri() {
        // Nu se face nimic, vagonul Marfa nu are serviciu de blocare a geamurilor
    }
}

class Tren implements Comparable<Tren> {
    private Vector<Vagon> vagoane = new Vector<>();

    void addVagon(Vagon vagon) {
        vagoane.add(vagon);
    }

    int getCapacitateTotalaColete() {
        int capacitateTotala = 0;
        for (Vagon vagon : vagoane) {
            capacitateTotala += vagon.getCapacitateColetePostale();
        }
        return capacitateTotala;
    }

    @Override
    public int compareTo(Tren tren) {
        return this.getCapacitateTotalaColete() - tren.getCapacitateTotalaColete();
    }

    void afiseazaTipuriVagoane() {
        System.out.println("Tipurile de vagoane existente în componența trenului:");
        for (Vagon vagon : vagoane) {
            if (vagon instanceof CalatoriA) {
                System.out.println("CalatoriA");
            } else if (vagon instanceof CalatoriB) {
                System.out.println("CalatoriB");
            } else if (vagon instanceof Marfa) {
                System.out.println("Marfa");
            }
        }
    }

    @Override
    public String toString() {
        return "Trenul are o capacitate totală de " + getCapacitateTotalaColete() + " colete.";
    }
}
