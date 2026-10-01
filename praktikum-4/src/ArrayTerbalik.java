import java.util.Scanner;

public class ArrayTerbalik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] data = new int[10];

        // Isi array dari input pengguna
        System.out.println("Masukkan 10 bilangan:");
        for (int i = 0; i < data.length; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            data[i] = sc.nextInt();
        }

        // Tampilkan array asli
        System.out.print("\nArray asli   : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
            if (i < data.length - 1) System.out.print(", ");
        }

        // Tampilkan array terbalik — loop dari indeks terakhir ke 0
        System.out.print("\nArray terbalik: ");
        for (int i = data.length - 1; i >= 0; i--) {
            System.out.print(data[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println();

        sc.close();
    }
}