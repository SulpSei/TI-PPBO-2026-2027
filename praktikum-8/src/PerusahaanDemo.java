public class PerusahaanDemo {
    public static void main(String[] args) {
        Manager mgr = new Manager("Munawar", "MA1212", 8000000, 2000000);
        Staff stf = new Staff("Intan", "ST1313", 5000000, 1000000);
        Direktur dir = new Direktur("Sulti", "DT14141", 15000000, 5000000, 3000000);

        System.out.println("=== Manager ===");
        mgr.tampilkanData();
        System.out.println("Tunjangan Jabatan: " + mgr.getTunjanganJabatan());

        System.out.println("\n=== Staff ===");
        stf.tampilkanData();
        System.out.println("Tunjangan Kinerja: " + stf.getTunjanganKinerja());

        // Direktur mewarisi lewat 2 tingkat: Pegawai -> Manager -> Direktur
        System.out.println("\n=== Direktur ===");
        dir.tampilkanData();
        System.out.println("Tunjangan Jabatan: " + dir.getTunjanganJabatan()); // dari Manager
        System.out.println("Tunjangan Saham  : " + dir.getTunjanganSaham());

    }
}
