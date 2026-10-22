public class ArrayBuku {
    public static void main(String[] args){
        Buku[] daftarbuku = new Buku[4];

        daftarbuku[0] = new Buku("Atomic Habits","James Clear",2018);
        daftarbuku[1] = new Buku("Pulang","Tere Liye",2015);
        daftarbuku[2] = new Buku("Bumi","Tere Liye",2004);
        daftarbuku[3] = new Buku("Dilan: Dia Adalah Dilanku Tahun 1991","Pidi Baiq",2015);

        for (Buku buku : daftarbuku){
            if (buku.tahunTerbit > 2015) {
               buku.tampilkanDataBuku();
            }
        }
    }
}
