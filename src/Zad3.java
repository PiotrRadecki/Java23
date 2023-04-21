import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Zad3 {
        public static void main(String[] args) throws ParseException {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
            List<Date> list = new ArrayList<Date>();
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String input = scanner.nextLine();
                Date date = simpleDateFormat.parse(input);
                list.add(date);
                for (Date date1 : list) {
                    System.out.println(simpleDateFormat.format(date1));
                }

            }
        }
}
