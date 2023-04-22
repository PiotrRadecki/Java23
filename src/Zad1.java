import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();
        scanner.close();

        int maxCellWidth = Integer.toString(n * n).length() + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int result = i * j;
                String formattedResult = String.format("%-" + maxCellWidth + "d", result);
                System.out.print(formattedResult);
            }
            System.out.println();
        }
    }
    }
