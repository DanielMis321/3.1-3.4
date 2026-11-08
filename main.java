public class main {
    public static void main(String[] args) {
        int wysokosc = 5; 

        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < wysokosc - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < wysokosc - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
}