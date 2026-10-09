import java.util.Scanner;

public class KalkulatorMethod {

    // =========================================================
    // Operasi dasar — semuanya return nilai
    // =========================================================

    static double tambah(double a, double b) {
        return a + b;
    }

    // Overloading: versi 3 parameter
    static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    static double kurang(double a, double b) {
        return a - b;
    }

    static double kali(double a, double b) {
        return a * b;
    }

    // Bagi perlu pengecekan — bukan urusan main, tapi method ini sendiri
    static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: tidak bisa membagi dengan nol.");
            return Double.NaN;
        }
        return a / b;
    }

    static double pangkat(double basis, double eksponen) {
        return Math.pow(basis, eksponen);
    }

    static double akarKuadrat(double a) {
        if (a < 0) {
            System.out.println("Error: tidak bisa menghitung akar dari bilangan negatif.");
            return Double.NaN;
        }
        return Math.sqrt(a);
    }

    // =========================================================
    // Riwayat — terima array hasil, kembalikan nilai terbesar
    // =========================================================

    static double riwayatKeMaksimum(double[] riwayatHasil, int jumlahData) {
        if (jumlahData == 0) return Double.NaN;
        double max = riwayatHasil[0];
        for (int i = 1; i < jumlahData; i++) {
            if (riwayatHasil[i] > max) max = riwayatHasil[i];
        }
        return max;
    }

    // =========================================================
    // Tampilkan menu
    // =========================================================

    static void tampilkanMenu() {
        System.out.println("\n============================");
        System.out.println("      KALKULATOR JAVA       ");
        System.out.println("============================");
        System.out.println("1. Tambah (2 angka)");
        System.out.println("2. Tambah (3 angka)");
        System.out.println("3. Kurang");
        System.out.println("4. Kali");
        System.out.println("5. Bagi");
        System.out.println("6. Pangkat");
        System.out.println("7. Akar Kuadrat");
        System.out.println("0. Keluar");
        System.out.print("Pilihan: ");
    }

    // =========================================================
    // Main — baca input, panggil method, simpan riwayat
    // =========================================================

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Riwayat dibatasi maksimal 100 operasi dalam satu sesi
        double[] riwayat = new double[100];
        int jumlahOperasi = 0;

        int pilihan;
        do {
            tampilkanMenu();
            pilihan = sc.nextInt();

            if (pilihan == 0) break;

            double hasil = Double.NaN;
            double a, b, c;

            switch (pilihan) {
                case 1:
                    System.out.print("Angka 1: "); a = sc.nextDouble();
                    System.out.print("Angka 2: "); b = sc.nextDouble();
                    hasil = tambah(a, b);
                    System.out.printf("Hasil: %.2f + %.2f = %.2f%n", a, b, hasil);
                    break;

                case 2:
                    System.out.print("Angka 1: "); a = sc.nextDouble();
                    System.out.print("Angka 2: "); b = sc.nextDouble();
                    System.out.print("Angka 3: "); c = sc.nextDouble();
                    hasil = tambah(a, b, c);
                    System.out.printf("Hasil: %.2f + %.2f + %.2f = %.2f%n", a, b, c, hasil);
                    break;

                case 3:
                    System.out.print("Angka 1: "); a = sc.nextDouble();
                    System.out.print("Angka 2: "); b = sc.nextDouble();
                    hasil = kurang(a, b);
                    System.out.printf("Hasil: %.2f - %.2f = %.2f%n", a, b, hasil);
                    break;

                case 4:
                    System.out.print("Angka 1: "); a = sc.nextDouble();
                    System.out.print("Angka 2: "); b = sc.nextDouble();
                    hasil = kali(a, b);
                    System.out.printf("Hasil: %.2f x %.2f = %.2f%n", a, b, hasil);
                    break;

                case 5:
                    System.out.print("Angka 1: "); a = sc.nextDouble();
                    System.out.print("Angka 2: "); b = sc.nextDouble();
                    hasil = bagi(a, b);
                    if (!Double.isNaN(hasil))
                        System.out.printf("Hasil: %.2f / %.2f = %.2f%n", a, b, hasil);
                    break;

                case 6:
                    System.out.print("Basis   : "); a = sc.nextDouble();
                    System.out.print("Eksponen: "); b = sc.nextDouble();
                    hasil = pangkat(a, b);
                    System.out.printf("Hasil: %.2f ^ %.2f = %.2f%n", a, b, hasil);
                    break;

                case 7:
                    System.out.print("Angka: "); a = sc.nextDouble();
                    hasil = akarKuadrat(a);
                    if (!Double.isNaN(hasil))
                        System.out.printf("Hasil: sqrt(%.2f) = %.2f%n", a, hasil);
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

            // Simpan ke riwayat hanya jika hasil valid dan array belum penuh
            if (!Double.isNaN(hasil) && jumlahOperasi < riwayat.length) {
                riwayat[jumlahOperasi] = hasil;
                jumlahOperasi++;
            }

        } while (pilihan != 0);

        // Tampilkan ringkasan riwayat saat keluar
        if (jumlahOperasi > 0) {
            System.out.println("\n============================");
            System.out.println("        RINGKASAN SESI      ");
            System.out.println("============================");
            System.out.println("Total operasi   : " + jumlahOperasi);
            System.out.printf("Hasil terbesar  : %.2f%n", riwayatKeMaksimum(riwayat, jumlahOperasi));
        } else {
            System.out.println("Tidak ada operasi yang dilakukan.");
        }

        System.out.println("Program selesai.");
        sc.close();
    }
}