public class PanggilBuku {
    public static void main(String[] args) {
        Buku Buku1 = new Buku("Atomic Habits","James Clear",2018);
        Buku Buku2 = new Buku("Bumi","Tere Liye",2004);

        System.out.println("Judul: " + Buku1.judul);
        System.out.println("Pengarang: " + Buku1.pengarang);
        System.out.println("Tahun Terbit: " + Buku1.tahunTerbit);
        System.out.println("---");
        System.out.println("Judul: " + Buku2.judul);
        System.out.println("Pengarang: " + Buku2.pengarang);
        System.out.println("Tahun Terbit: " + Buku2.tahunTerbit);
    }
}
