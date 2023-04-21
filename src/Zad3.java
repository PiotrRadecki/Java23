import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Zad3 {
    static SimpleDateFormat simpleDateFormat;
    static List<Date> list;
        public static void main(String[] args) throws ParseException {
            simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
            list = new ArrayList<Date>();
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String input = scanner.nextLine();
                Date date = simpleDateFormat.parse(input);
                if (list.contains(date)) {
                    printList();
                    continue;
                }
                list.add(0,date);
                if(list.size() == 1) {

                }
                else if (list.size() > 4){
                    list.remove(4);
                }
                else {
                for(int i=0; i<list.size()-1; i++) {
                    if(date.compareTo(list.get(i+1)) > 0){
                        Date temp = list.get(i+1);
                        list.set(i, temp);
                        list.set(i+1, date);
                    }
                }
                }
                printList();
            }
        }
        public static void printList() {
            for (Date date1 : list) {
                System.out.println(simpleDateFormat.format(date1));
            }
        }
}
