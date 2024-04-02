package ro.unitbv.pclp2.lab6;

class Punct {
    private int x;
    private int y;
    public Punct() {
        this.x = 0;
        this.y = 0;
    }
    public Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double distance(Punct p1) {
        return Math.sqrt(Math.pow(this.x - p1.getX(), 2) + Math.pow(this.y - p1.getY(), 2));
    }
}
public class TestPunct {
    public static void main(String[] args) {
        Punct A = new Punct(1, 2);
        Punct B = new Punct(-1, 3);

        double distanta = A.distance(B);
        System.out.println("Distanța dintre punctele A" + A.toString() + " și B" + B.toString() + " este: " + distanta);
    }
}

