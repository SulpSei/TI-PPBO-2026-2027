public class LatihanProduk {
    String namaProduk;
    double harga;

    public LatihanProduk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public boolean isMahal(double BatasHarga) {
        return harga > BatasHarga;
    }


}
