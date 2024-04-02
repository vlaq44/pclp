package ro.unitbv.pclp2.lab6;

public class ComplexNumber {
    double real;
    double imaginar;

    public ComplexNumber(int real, int imaginar) {
        this.real = real;
        this.imaginar = imaginar;
    }

    public ComplexNumber(ComplexNumber complexNumber) {
        this.real = complexNumber.real;
        this.imaginar = complexNumber.imaginar;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginar(int imaginar) {
        this.imaginar = imaginar;
    }

    public double getReal() {
        return real;
    }

    public double getImaginar() {
        return imaginar;
    }

    @Override
    public String toString() {
        return real + " + " + imaginar + 'i';
    }

    public void add(double re, double im) {
        this.real += re;
        this.imaginar += im;
    }

    public void add(ComplexNumber c) {
        this.real += c.real;
        this.imaginar += c.imaginar;
    }

    public void addReal(double re) {
        this.real += re;
    }

    public void addIm(double im) {
        this.imaginar += im;
    }

    public void SubtractRe(double re) {
        this.real -= re;
    }

    public void SubtractIm(double im) {
        this.imaginar -= im;
    }

    public double absValue() {
        return Math.sqrt(this.real * this.real + this.imaginar * this.imaginar);
    }

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 2);
        ComplexNumber b = new ComplexNumber(-1, 3);
        a.add(b);
        System.out.println(a);
        a.SubtractRe(b.real);
        a.SubtractIm(b.imaginar);
        System.out.println(a);
        System.out.println("Abs de a: " + a.absValue());
        System.out.println("Abs de b: " + b.absValue());
    }
}
