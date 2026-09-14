public class LogikaDemo {
    public static void main(String[] args){
        int nilaiujian = 80;
        int kehadiran = 90; //persen

        // Gabungkan Dua Kondisi dengan &&
        if (nilaiujian >= 75 && kehadiran >= 80) {
            System.out.println("LULUS Mata Kuliah");
        } else {
            System.out.println("TIDAK LULUS Mata Kuliah");
        }

        // Coba Operator || dan !
        boolean punyaKTP = false;
        boolean punyaSIM = true;

        if (punyaKTP || punyaSIM) {
            System.out.println("Boleh Menyewa Kendaraan");
        }
        if (!punyaKTP) {
            System.out.println("KTP Belom Tersedia");
        }

        /* Operator Aturan Hasil
          && (AND) true hanya jika kedua kondisi bernilai true
          || (OR) true jika salah satu (atau kedua) kondisi bernilai true
          ! (NOT) membalik nilai boolean: !true menjadi false, !false menjadi true
         */
    }
}
