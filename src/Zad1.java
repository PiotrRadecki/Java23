import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();
        scanner.close();

        int maxCellWidth = Integer.toString(n * n).length() + 1;

    }
}
