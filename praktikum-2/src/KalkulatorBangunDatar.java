import java.util.Scanner;

public class KalkulatorBangunDatar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = sc.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = sc.nextDouble();

        // Menghitung luas persegi panjang
        double luasPersegiPanjang = panjang * lebar;
        //Menghitung keliling persegi panjang
        double kelilingPersegiPanjang = 2 * (panjang + lebar);

        // Menampilkan hasil perhitungan persegi panjang
        System.out.println("\n=== PERSEGI PANJANG ===");
        System.out.println("Luas : " + luasPersegiPanjang);
        System.out.println("Keliling : " + kelilingPersegiPanjang);

        // Menentukan apakah luas persegi panjang lebih besar dari 100
        boolean luasBesar = luasPersegiPanjang > 100;
        // Menampilkan nilai boolean luasBesar
        System.out.println("Luas > 100 : " + luasBesar);

        // Meminta input jari-jari lingkaran
        System.out.print("\nMasukkan jari-jari lingkaran: ");
        double jariJari = sc.nextDouble();

        // Menghitung luas lingkaran menggunakan Math.PI
        double luasLingkaran = Math.PI * jariJari * jariJari;
        // Menghitung keliling lingkaran menggunakan Math.PI
        double kelilingLingkaran = 2 * Math.PI * jariJari;

        // Menampilkan hasil perhitungan lingkaran
        System.out.println("\n=== LINGKARAN ===");
        System.out.println("Luas : " + luasLingkaran);
        System.out.println("Keliling : " + kelilingLingkaran);

        // Menutup Scanner setelah selesai digunakan
        sc.close();
    }
}
