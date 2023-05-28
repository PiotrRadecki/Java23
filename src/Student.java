import java.util.*;

public class Student implements Comparable<Student> {
    private int rocznik;
    private String nazwisko;
    private double srednia;

    public Student(int rocznik, String nazwisko, double srednia) {
        this.rocznik = rocznik;
        this.nazwisko = nazwisko;
        this.srednia = srednia;
    }


}
