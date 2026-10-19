public class Mahasiswa {
    String nama;
    String nim;
    double ipk;

    //Constructor Default (Tanpa Parameter)
    public Mahasiswa(){
        nama = "Belum Diisi";
        nim = "-";
        ipk = 0.0;
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
