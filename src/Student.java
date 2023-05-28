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

    public int getRocznik() {
        return rocznik;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getSrednia() {
        return srednia;
    }

    @Override
    public int compareTo(Student other) {
        // Porównanie rocznika
        if (rocznik != other.rocznik) {
            return Integer.compare(rocznik, other.rocznik);
        }

        // Porównanie średniej
        if (srednia != other.srednia) {
            return Double.compare(srednia, other.srednia);
        }

        // Porównanie nazwiska
        return nazwisko.compareTo(other.nazwisko);
    }


}
