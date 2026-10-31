public class RekeningBank {
    private String nomorRekening;
    private String pemilik;
    private String jenisRekening;
    private double saldo;

    public RekeningBank(String nomor, String pemilik, String jenisRekening, double saldoAwal) {
        this.nomorRekening = nomor;
        this.pemilik = pemilik;
        this.jenisRekening = jenisRekening;
        this.saldo = (saldoAwal >= 0) ? saldoAwal : 0;
    }

    public String getNomorRekening(){
        return nomorRekening;
    }
    public String getPemilik(){
        return pemilik;
    }
    public String getJenisRekening(){
        return jenisRekening;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah setor harus lebih dari 0");
            return;
        }
        saldo += jumlah;
        System.out.println("Setor berhasil. Saldo: " + saldo);
    }
    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah tarik harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil. Saldo: " + saldo);
        }
    }
    public void transferKe(RekeningBank tujuan, double jumlah) {
        if (tujuan == null) {
            System.out.println("Transfer Gagal: Rekening Tujuan tidak Valid");
        } else if (tujuan == this) {
            System.out.println("Transfer Gagal: tidak bisa Transfer ke Rekening Sendiri");
        } else if (jumlah <= 0) {
            System.out.println("Transfer Gagal: Jumlah Transfer Harus Lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Transfer Gagal: Saldo Tidak Mencukupi (Saldo: " + saldo + ")");
        } else {
            this.saldo -= jumlah;
            tujuan.saldo += jumlah;
            System.out.println("Transfer Berhasil: " + jumlah + " dari " + this.nomorRekening + " ke " + tujuan.nomorRekening);
        }
    }

    //Cetak Laporan mutasi
    public void cetakMutasi() {
        System.out.println(" ");
        System.out.println("Mutasi Rekening");
        System.out.println("===============");
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Pemilik: " + pemilik);
        System.out.println("Jenis Rekening: " + jenisRekening);
        System.out.println("Saldo Saat Ini: Rp " + saldo);
    }
}
