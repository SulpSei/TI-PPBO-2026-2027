public class BangunDatarDemo {
    public static void main(String[] args) {
        BangunDatar[] daftarBangunDatar = {
                new Lingkaran("Lingkaran A",5),
                new Persegi("Persegi A",5),
                new PersegiPanjang("Persegi Panjang A",8, 4),
                new Lingkaran("Lingkaran B",3),
                new PersegiPanjang("Persegi Panjang B", 10, 6),
                new Persegi("Persegi B", 9),
        };

        double totalLuas = 0;
        BangunDatar terbesar = daftarBangunDatar[0];

        for (BangunDatar bd : daftarBangunDatar) {
            bd.tampilkanInfo();
            totalLuas += bd.hitungLuas();
            if (bd.hitungLuas() > terbesar.hitungLuas()) {
                terbesar = bd;
            }
        }

        System.out.println();
        System.out.println("Total : " + totalLuas);
        System.out.println("Bangun dengan luas terbesar: " + terbesar.getNamaBangun() + " (" + terbesar.hitungLuas() + ")");
    }
}
