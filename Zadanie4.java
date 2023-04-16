import java.time.LocalDateTime;
import java.util.TimeZone;
public class Zadanie4 {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.of(2023, 4, 7, 12, 0);
        TimeZone zone1 = TimeZone.getTimeZone("Europe/Warsaw");
        TimeZone zone2 = TimeZone.getTimeZone("America/New_York");

        int hoursDifference = (zone1.getRawOffset() - zone2.getRawOffset()) / zone1.getDSTSavings();

        System.out.println("Różnica czasu między strefami: " + hoursDifference + " godzin.");
    }
}