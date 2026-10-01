import java.util.Scanner;

public class PolaSegitiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan tinggi/ukuran pola: ");
        int ukuran = sc.nextInt();

        // --- Pola Segitiga Terbalik ---
        System.out.println("\nPola Segitiga Terbalik:");
        for (int i = ukuran; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // --- Pola Persegi ---
        System.out.println("\nPola Persegi:");
        for (int i = 1; i <= ukuran; i++) {
            for (int j = 1; j <= ukuran; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}