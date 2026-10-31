/**
 * Program uji untuk Latihan 1-5.
 * Setiap latihan menguji skenario valid dan tidak valid.
 */
public class LatihanEncapsulation {
    public static void main(String[] args) {

        // ===== Latihan 1 & 2: Buku =====
        System.out.println("=== Latihan 1 & 2: Buku ===");
        Buku b1 = new Buku("Algoritma Dasar", "Budi", 2020);
        System.out.println("Judul    : " + b1.getJudul());
        System.out.println("Pengarang: " + b1.getPengarang());
        System.out.println("Tahun    : " + b1.getTahunPenerbit());
        b1.setJudul("Struktur Data");
        b1.setPengarang("Siti");
        System.out.println("Setelah diubah -> " + b1.getJudul() + " oleh " + b1.getPengarang());
        // b1.setTahunTerbit(2024); // ERROR kompilasi: method tidak ada (read-only)
        // b1.judul = "X";          // ERROR kompilasi: judul has private access

        // ===== Latihan 3: Waktu =====
        System.out.println("\n=== Latihan 3: Waktu ===");
        Waktu w = new Waktu(10, 30, 45);
        System.out.println("Waktu awal: " + w.tampilkan());
        w.setJam(25);    // ditolak
        w.setMenit(60);  // ditolak
        w.setDetik(-1);  // ditolak
        w.setJam(23);    // valid
        System.out.println("Waktu akhir: " + w.tampilkan());

        // ===== Latihan 4: Siswa =====
        System.out.println("\n=== Latihan 4: Siswa ===");
        Siswa s = new Siswa(88);
        System.out.println("Nilai: " + s.getNilai() + " -> " + s.getNilaiHuruf());
        s.setNilai(72);
        System.out.println("Nilai: " + s.getNilai() + " -> " + s.getNilaiHuruf());
        s.setNilai(150); // ditolak
        s.setNilai(-5);  // ditolak
        s.setNilai(30);
        System.out.println("Nilai: " + s.getNilai() + " -> " + s.getNilaiHuruf());

        // ===== Latihan 5: Produk =====
        System.out.println("\n=== Latihan 5: Produk ===");
        Produk p = new Produk("P001", "Pulpen", 3000, 50);
        System.out.println(p.getKodeProduk() + " | " + p.getNamaProduk()
                + " | Rp" + p.getHarga() + " | stok " + p.getStok());
        p.setHarga(3500);    // valid
        p.setHarga(-100);    // ditolak
        p.tambahStok(20);    // valid
        p.tambahStok(0);     // ditolak
        p.kurangiStok(30);   // valid
        p.kurangiStok(500);  // ditolak, stok tidak cukup
        p.kurangiStok(-2);   // ditolak
        System.out.println("Stok akhir: " + p.getStok());
    }
}