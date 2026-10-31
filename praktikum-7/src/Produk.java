public class Produk {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    public Produk(String kodeProduk, String namaProduk, double harga, int stok){
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = (harga >= 0) ? harga : 0;
        this.stok = (stok >= 0) ? stok : 0;
    }


    public void kurangiStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah kurangi stok harus lebih dari 0");
        } else if (jumlah > stok) {
            System.out.println("Stok tidak mencukupi (stok: " + stok + ")");
        } else {
            stok -= jumlah;
            System.out.println("Stok berkurang. Stok sekarang: " + stok);
        }
    }

    // ===== Setter harga dengan validasi =====
    public void setHarga(double harga) {
        if (harga < 0) {
            System.out.println("Harga tidak boleh negatif");
        } else {
            this.harga = harga;
            System.out.println("Harga berhasil diubah menjadi " + harga);
        }
    }

    // ===== Method pengubah stok dengan validasi =====
    public void tambahStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah tambah stok harus lebih dari 0");
            return;
        }
        stok += jumlah;
        System.out.println("Stok bertambah. Stok sekarang: " + stok);
    }

    // ===== Getter =====
    public String getKodeProduk() {
        return kodeProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }
}
