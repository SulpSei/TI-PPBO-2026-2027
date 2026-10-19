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

    public Mahasiswa(String namaAwal, String nimAwal, Double ipkAwal) {
        nama = namaAwal;
        nim = nimAwal;
        ipk = ipkAwal;
    }
}
