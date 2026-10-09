import java.util.Scanner;

public class CariNilaiUjian {

    static int cariNilaiMinimum(int[] data) {
        int min = data[0];
        for (int nilai : data) {
            if (nilai < min) min = nilai;
        }
        return min;
    }

    static int cariNilaiMaksimum(int[] data) {
        int max = data[0];
        for (int nilai : data) {
            if (nilai > max) max = nilai;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan brp jumlah nilai ujian yg ingin di cari: ");
        int n = sc.nextInt();

        int[] nilai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nilai ke-%d: ", i + 1);
            nilai[i] = sc.nextInt();
        }

        System.out.println("\nHasil:");
        System.out.println("Nilai minimum: " + cariNilaiMinimum(nilai));
        System.out.println("Nilai maksimum: " + cariNilaiMaksimum(nilai));

        sc.close();
    }
}