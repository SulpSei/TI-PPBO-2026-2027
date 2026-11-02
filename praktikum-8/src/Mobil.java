public class Mobil extends Kendaraan{
    protected int jumlahPintu;

    public Mobil(String merk, int kecepatanMaks, int jumlahPintu) {
        super(merk, kecepatanMaks);
        this.jumlahPintu = jumlahPintu;
    }

    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan Maks: " + kecepatanMaks + "km/j");
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println(" ");
    }
}
