package ro.unitbv.pclp2.lab9;

import java.util.*;

interface Persoana extends Comparable<Persoana> {
    public double calculMedieGenerala();
    public String getNume();
    public void setNume(String nume);
    public void addMedie(double medie);
}

class Student implements Persoana {
    private String nume;
    private List<Double> medii = new ArrayList<>();

    public Student(String nume) {
        this.nume = nume;
    }

    public double calculMedieGenerala() {
        if (medii.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (double medie : medii) {
            sum += medie;
        }
        return sum / medii.size();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void addMedie(double medie) {
        medii.add(medie);
    }

    @Override
    public int compareTo(Persoana persoana) {
        if (persoana instanceof Student) {
            Student altStudent = (Student) persoana;
            int comparatieNume = this.nume.compareTo(altStudent.getNume());
            if (comparatieNume != 0) {
                return comparatieNume;
            } else {
                return Double.compare(altStudent.calculMedieGenerala(), this.calculMedieGenerala());
            }
        }
        return 0;
    }
}

public class p2 {
    public static void main(String[] args) {
        Vector<Student> vectorStudenti = new Vector<>();
        Student student1 = new Student("John");
        student1.addMedie(8.5);
        student1.addMedie(9.0);

        Student student2 = new Student("Alice");
        student2.addMedie(9.2);
        student2.addMedie(8.7);

        Student student3 = new Student("John");
        student3.addMedie(7.8);
        student3.addMedie(8.0);

        vectorStudenti.add(student1);
        vectorStudenti.add(student2);
        vectorStudenti.add(student3);

        Collections.sort(vectorStudenti);

        for (Student student : vectorStudenti) {
            System.out.println("Nume: " + student.getNume() + ", Medie generală: " + student.calculMedieGenerala());
        }
    }
}

