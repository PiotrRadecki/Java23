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
    private static void accessArrayElement() {
        int[] array = {1, 2, 3};
        int index = 5;
        try {
            int element = array[index];
            System.out.println("Element tablicy: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }
}

