public class Main {
    public static void main(String[] args) {
        // Zewnętrzna pętla dla wierszy (od 1 do 10)
        for (int i = 1; i <= 10; i++) {
            // Wewnętrzna pętla dla kolumn (od 1 do 10)
            for (int j = 1; j <= 10; j++) {
                int wynik = i * j;
                // Wyświetlanie wyniku z tabulatorem (\t) dla równego ułożenia kolumn
                System.out.print(wynik + "\t");
            }
            // Przejście do nowej linii po zakończeniu całego wiersza
            System.out.println();
        }
    }
}