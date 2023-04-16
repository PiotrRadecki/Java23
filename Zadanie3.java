import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Zadanie3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            // Wczytaj pierwszą datę
            System.out.print("Podaj pierwszą datę w formacie dd/MM/yyyy: ");
            LocalDate date1 = LocalDate.parse(scanner.nextLine(), formatter);

            // Wczytaj drugą datę
            System.out.print("Podaj drugą datę w formacie dd/MM/yyyy: ");
            LocalDate date2 = LocalDate.parse(scanner.nextLine(), formatter);

            // Oblicz liczbę dni między datami
            long daysBetween = ChronoUnit.DAYS.between(date1, date2);

            System.out.println("Liczba dni między datami: " + daysBetween);
        }
}

