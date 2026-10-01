import java.util.Scanner;

public class TerbesarKedua {
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

        // Pastikan minimal ada 2 elemen
        if (n < 2) {
            System.out.println("Data harus minimal 2 elemen.");
            sc.close();
            return;
        }

        // Cari nilai terbesar pertama dan kedua sekaligus dalam satu pass
        int terbesar = Integer.MIN_VALUE;
        int terbesarKedua = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (data[i] > terbesar) {
                // Nilai terbesar baru ditemukan — geser terbesar ke posisi kedua
                terbesarKedua = terbesar;
                terbesar = data[i];
            } else if (data[i] > terbesarKedua && data[i] != terbesar) {
                // Bukan terbesar, tapi lebih besar dari terbesar kedua
                terbesarKedua = data[i];
            }
        }

        System.out.println("\nNilai terbesar pertama : " + terbesar);

        if (terbesarKedua == Integer.MIN_VALUE) {
            System.out.println("Tidak ada nilai terbesar kedua (semua nilai sama).");
        } else {
            System.out.println("Nilai terbesar kedua   : " + terbesarKedua);
        }

        sc.close();
    }
}