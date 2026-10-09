public class FilterNilaiUjian {

    static int hitungTotal(int[] data) {
        int total = 0;
        for (int nilai : data) total += nilai;
        return total;
    }

    static int[] filterDiAtasRataRata(int[] data) {
        double rataRata = (double) hitungTotal(data) / data.length;

        int jumlahLolos = 0;
        for (int nilai : data) {
            if (nilai > rataRata) jumlahLolos++;
        }

        int[] hasil = new int[jumlahLolos];
        int indeks = 0;
        for (int nilai : data) {
            if (nilai > rataRata) {
                hasil[indeks] = nilai;
                indeks++;
            }
        }
        return hasil;
    }

    public static void main(String[] args) {
        int[] nilai = {70, 85, 60, 90, 55, 78, 88};

        int total = hitungTotal(nilai);
        double rataRata = (double) total / nilai.length;
        int[] diAtas = filterDiAtasRataRata(nilai);

        System.out.print("Data asli    : ");
        for (int n : nilai) System.out.print(n + " ");

        System.out.println();
        System.out.println("Total        : " + total);
        System.out.printf("Rata-rata    : %.2f%n", rataRata);

        System.out.print("Di atas rata : ");
        for (int n : diAtas) System.out.print(n + " ");
        System.out.println();
    }
}