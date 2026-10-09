public class LuasBangunDatar {

    static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }

    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        System.out.println("=== Luas Persegi Panjang ===");
        System.out.printf("p=5, l=3   -> %.2f%n", luasPersegiPanjang(5, 3));
        System.out.printf("p=10, l=4  -> %.2f%n", luasPersegiPanjang(10, 4));
        System.out.printf("p=7.5, l=2 -> %.2f%n", luasPersegiPanjang(7.5, 2));

        System.out.println("\n=== Luas Lingkaran ===");
        System.out.printf("r=7  -> %.2f%n", luasLingkaran(7));
        System.out.printf("r=3  -> %.2f%n", luasLingkaran(3));
        System.out.printf("r=10 -> %.2f%n", luasLingkaran(10));
    }
}