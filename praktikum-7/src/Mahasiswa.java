public class Mahasiswa {
    private String nama;
    private String nim;
    private double ipk;

    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
    public double getIpk() {
        return ipk;
    }

    public Mahasiswa(String nama, String nim, Double ipk) {
        this.nama = nama;//this.nama = atribut, nama = parameter
        this.nim = nim;
        this.ipk = ipk;
    }

    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("IPK: " + ipk);
    }

    public boolean isCumlaude() {
        return ipk >= 3.5;
    }
}
