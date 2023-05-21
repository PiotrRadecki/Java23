import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad1 {

    public static void main(String[] args) {
        try {
            readFile("nonexistent.txt");
            divideNumbers(10, 0);
            accessArrayElement();
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku.");
        } catch (ArithmeticException e) {
            System.out.println("Dzielenie przez zero jest niedozwolone.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Przekroczono zakres tablicy.");
        }
    }
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

