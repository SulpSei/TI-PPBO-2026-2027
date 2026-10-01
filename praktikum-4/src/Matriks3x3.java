import java.util.Scanner;

public class Matriks3x3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriks = new int[3][3];

        // Input matriks dari pengguna
        System.out.println("Masukkan elemen matriks 3x3:");
        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 3; kolom++) {
                System.out.print("Baris " + (baris + 1) + ", Kolom " + (kolom + 1) + ": ");
                matriks[baris][kolom] = sc.nextInt();
            }
        }

        // Tampilkan matriks
        System.out.println("\nMatriks yang dimasukkan:");
        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 3; kolom++) {
                System.out.print(matriks[baris][kolom] + "\t");
            }
            System.out.println();
        }

        // Hitung jumlah per baris dan total keseluruhan
        int totalSeluruh = 0;

        System.out.println("\nJumlah per baris:");
        for (int baris = 0; baris < 3; baris++) {
            int jumlahBaris = 0;
            for (int kolom = 0; kolom < 3; kolom++) {
                jumlahBaris += matriks[baris][kolom];
            }
            System.out.println("Baris " + (baris + 1) + " : " + jumlahBaris);
            totalSeluruh += jumlahBaris;
        }

        System.out.println("Total seluruh elemen: " + totalSeluruh);

        sc.close();
    }
}