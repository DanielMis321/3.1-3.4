import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź dowolny tekst:");
        String tekst = scanner.nextLine();

        // Zamiana tekstu na tablicę znaków
        char[] znaki = tekst.toCharArray();

        // Pętla przechodząca przez każdy znak
        for (int i = 0; i < znaki.length; i++) {
            char aktualnyZnak = znaki[i];

            // Sprawdzanie i zamiana wielkości liter
            if (Character.isUpperCase(aktualnyZnak)) {
                znaki[i] = Character.toLowerCase(aktualnyZnak);
            } else if (Character.isLowerCase(aktualnyZnak)) {
                znaki[i] = Character.toUpperCase(aktualnyZnak);
            }
        }

        // Wyświetlenie wyniku
        System.out.print("Tekst po zamianie liter: ");
        for (int i = 0; i < znaki.length; i++) {
            System.out.print(znaki[i]);
        }
        System.out.println();
    }
}