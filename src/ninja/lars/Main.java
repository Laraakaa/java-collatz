package ninja.lars;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Eingabe: ");
	    String line = scanner.nextLine();

	    long input;
	    try {
	        input = Long.valueOf(line);
        } catch (NumberFormatException e) {
	        System.out.println("Please enter a number!");
	        return;
        }

        System.out.println("Prozudurale berechnung: ");
	    collatz_procedure(input);

	    System.out.println("Funktionale berechnung: ");
	    collatz_function(input);

    }

    private static void collatz_procedure(long n) {
        while (true) {
            System.out.print(n + " ");

            if (n == 1) {
                System.out.print("\n");
                break;
            }

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
    }

    private static void collatz_function(long n) {
        System.out.print(n + " ");

        if (n == 1) {
            System.out.print("\n");
            return;
        }

        if (n % 2 == 0) {
            collatz_function(n / 2);
        } else {
            collatz_function(3 * n + 1);
        }
    }
}
