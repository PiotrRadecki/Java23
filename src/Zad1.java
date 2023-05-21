import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad1 {
    private static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        scanner.close();
    }
}

