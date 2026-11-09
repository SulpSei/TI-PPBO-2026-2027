public class BangunDatarDemo {
    public static void main(String[] args) {
        BangunDatar[] daftarBangunDatar = {
                new Lingkaran(5),
                new Persegi(5),
                new Lingkaran(3),
                new Persegi(8)
        };

        double totalLuas = 0;
        for (BangunDatar bd : daftarBangunDatar) {
            double luas = bd.hitungLuas();
            System.out.println("-- " + luas);
            totalLuas += luas;
        }

        System.out.println(" ");
        System.out.println("Total : " + totalLuas);
    }
}
