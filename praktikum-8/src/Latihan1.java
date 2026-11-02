public class Latihan1 {
    public static void main(String[] args) {
        Kucing k1 = new Kucing();
        k1.nama = "Tom";
        System.out.println("Kucing: " + k1.nama);
        k1.bersuara();

        Anjing a1 = new Anjing();
        a1.nama = "Timmy";
        System.out.println("Anjing: " + a1.nama);
        a1.bersuara();
    }
}
