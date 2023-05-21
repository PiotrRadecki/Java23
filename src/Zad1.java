import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad1 {
    private static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        scanner.close();
    }

    private static void divideNumbers(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Dzielenie przez zero");
        }
        int result = a / b;
        System.out.println("Wynik dzielenia: " + result);
    }
}

