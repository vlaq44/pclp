package ro.unitbv.pclp2.lab7;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}

class Student extends Person {
    private String[] courses;
    private double[] grades;
    private int numCourses;

    public Student(String name, String address, int maxCourses) {
        super(name, address);
        courses = new String[maxCourses];
        grades = new double[maxCourses];
        numCourses = 0;
    }

    public void addCourseGrade(String courseName, double grade) {
        courses[numCourses] = courseName;
        grades[numCourses] = grade;
        numCourses++;
    }

    public double getAverageGrade() {
        if (numCourses == 0) {
            return 0.0;
        }

        double total = 0.0;
        for (int i = 0; i < numCourses; i++) {
            total += grades[i];
        }
        return total / numCourses;
    }

    public void printGrades() {
        System.out.println("Grades:");
        for (int i = 0; i < numCourses; i++) {
            System.out.println(courses[i] + ": " + grades[i]);
        }
    }

    @Override
    public String toString() {
        return "Student{name='" + getName() + "', address='" + getAddress() + "'}";
    }
}

class Teacher extends Person {
    private String[] courses;
    private int numCourses;

    public Teacher(String name, String address, int maxCourses) {
        super(name, address);
        courses = new String[maxCourses];
        numCourses = 0;
    }

    public boolean addCourse(String courseName) {
        if (numCourses < courses.length) {
            courses[numCourses] = courseName;
            numCourses++;
            return true;
        }
        return false;
    }

    public boolean removeCourse(String courseName) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(courseName)) {
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                numCourses--;
                return true;
            }
        }
        return false;
    }
}

class Test4 {
    public static void main(String[] args) {
        Person student, teacher, person;
        student = new Student("Popescu Ion", "Bucuresti", 10);
        teacher = new Teacher("Ionescu Gigel", "Bucuresti", 10);
        person = new Person("Maria", "Iasi");

        assert (person.getName().equals("Maria")) : "Metoda getName din clasa Person nu este implementata corect";
        assert (((Teacher) teacher).addCourse("Programare")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (((Teacher) teacher).addCourse("Algoritmica")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (((Teacher) teacher).addCourse("Matematica")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (!((Teacher) teacher).addCourse("Programare")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (((Teacher) teacher).removeCourse("Programare")) : "Metoda removeCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (!((Teacher) teacher).addCourse("Programare")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";

        System.out.println(student);
        System.out.println(person);
        System.out.println("Felicitari! Problema a fost rezolvata corect!");
    }
}
