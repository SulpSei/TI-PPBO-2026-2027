public class ArrayDemo {
    public static void main(String[] args){
        //Cara 1: Deklarasi langsung dengan nilai awal
        int[] nilai = {80, 75, 90, 60, 88};

        //Cara 2: Deklarasi ukuran dulu, isi belakangan
        String[] namaHari = new  String[3];
        namaHari[0] = "Senin";
        namaHari[1] = "Selasa";
        namaHari[2] = "Rabu";

        System.out.println("Elemen Pertama Nilai: " + nilai[0]);
        System.out.println("Jumlah Elemen Nilai: " + nilai.length);
        System.out.println("Hari Kedua: " + namaHari[1]);

        System.out.println("--- Menggunakaan for biasa ---");
        for (int i = 0; i < nilai.length; i++){
            System.out.println("Indeks " + i + ": " +nilai[i]);
        }

        System.out.println("--- Menggunakaan enhanced for ---");
        for (int n : nilai){
            System.out.println(n);
        }
    }
}
