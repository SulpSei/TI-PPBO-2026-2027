public class Manager extends Pegawai {
    private double tunjanganJabatan;

    public Manager(String nama, String nip, double gajiPokok, double tunjanganJabatan) {
        super(nama, nip, gajiPokok); //panggil constructor Pegawai
        System.out.println("2. Constructor Manager Dijalankan");
        this.tunjanganJabatan = tunjanganJabatan;
    }
}
