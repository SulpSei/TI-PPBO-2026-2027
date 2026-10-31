public class BankDemo {
    public static void main(String[] args) {
        RekeningBank rek1 = new RekeningBank("1625", "Sulti Syawal", "Tabungan", 100000);
        RekeningBank rek2 = new RekeningBank("1724", "Iqlima", "Giro", 200000);

        System.out.println("Skenario 1: Setor dan Tarik Rekening Sulti Syawal");
        rek1.setor(50000);
        rek1.tarik(30000);

        System.out.println("\nSkenario 2: Setor dan Tarik Rekening Iqlima");
        rek2.tarik(100000);
        rek2.setor(50000);

        System.out.println("\nSkenario 3: Transfer Berhasil");
        rek1.transferKe(rek2, 40000);

        System.out.println("\nSkenario 4: Transfer Gagal (Saldo Tidak Mencukupi)");
        rek1.transferKe(rek2, 7000000);

        System.out.println("\nSkenario 5: Transfer Gagal (Jumlah Tidak Valid)");
        rek1.transferKe(rek2, -5000);

        System.out.println("\nSkenario 6: Validasi Setor & Tarik Ditolak");
        rek1.setor(-1000);
        rek2.tarik(0);

        System.out.println("\n=== Mutasi Akhir ===");
        rek1.cetakMutasi();
        rek2.cetakMutasi();
    }
}
