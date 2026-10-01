import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int n = sc.nextInt();

        int[] data = new int[n];

        System.out.println("Masukkan " + n + " bilangan:");
        for (int i = 0; i < n; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            data[i] = sc.nextInt();
        }

        // Tampilkan sebelum diurutkan
        System.out.print("\nSebelum diurutkan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println();

        // Bubble Sort Ascending
        // Setiap pass ke luar, elemen terbesar "menggelembung" ke posisi akhir
        for (int pass = 0; pass < n - 1; pass++) {
            for (int i = 0; i < n - 1 - pass; i++) {
                if (data[i] > data[i + 1]) {
                    // Tukar posisi data[i] dan data[i+1]
                    int temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                }
            }
        }

        // Tampilkan sesudah diurutkan
        System.out.print("Sesudah diurutkan  : ");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println();

        sc.close();
    }
}