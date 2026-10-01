import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // KKM bisa diubah di sini tanpa perlu menyentuh bagian lain program
        int KKM = 70;

        // Baca jumlah mahasiswa dan nilai ujian masing-masing
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        int[] nilai = new int[n];

        System.out.println("Masukkan nilai ujian tiap mahasiswa (0-100):");
        for (int i = 0; i < n; i++) {
            System.out.print("Mahasiswa " + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }


        // Hitung statistik kelas
        int total = 0;
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < n; i++) {
            total += nilai[i];

            // Cek nilai tertinggi dan terendah
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }

            // Hitung jumlah lulus dan tidak lulus berdasarkan KKM
            if (nilai[i] >= KKM) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        double rataRata = (double) total / n;

        // Sorting dengan Bubble Sort Ascending (tanpa method bawaan)

        // Simpan salinan array asli untuk ditampilkan (array nilai akan diubah saat sorting)
        int[] nilaiAsli = new int[n];
        for (int i = 0; i < n; i++) {
            nilaiAsli[i] = nilai[i];
        }

        // Proses bubble sort pada array nilai
        for (int pass = 0; pass < n - 1; pass++) {
            for (int i = 0; i < n - 1 - pass; i++) {
                if (nilai[i] > nilai[i + 1]) {
                    int temp = nilai[i];
                    nilai[i] = nilai[i + 1];
                    nilai[i + 1] = temp;
                }
            }
        }

        // Tampilkan laporan akhir
        System.out.println("\n================================================");
        System.out.println("         LAPORAN NILAI KELAS");
        System.out.println("================================================");
        System.out.println("Jumlah Mahasiswa : " + n);
        System.out.println("KKM              : " + KKM);
        System.out.println("------------------------------------------------");
        System.out.printf("Rata-rata Kelas  : %.2f%n", rataRata);
        System.out.println("Nilai Tertinggi  : " + nilaiTertinggi);
        System.out.println("Nilai Terendah   : " + nilaiTerendah);
        System.out.println("------------------------------------------------");
        System.out.println("Jumlah Lulus     : " + jumlahLulus + " mahasiswa");
        System.out.println("Jumlah Tidak Lulus: " + jumlahTidakLulus + " mahasiswa");
        System.out.println("------------------------------------------------");

        // Tampilkan array sebelum diurutkan
        System.out.print("Nilai (asli)     : ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilaiAsli[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println();

        // Tampilkan array sesudah diurutkan
        System.out.print("Nilai (terurut)  : ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilai[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println();

        System.out.println("================================================");

        sc.close();
    }
}