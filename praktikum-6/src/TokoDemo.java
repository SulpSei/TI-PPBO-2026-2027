public class TokoDemo {
    public static void main(String[] args){
        Produk[] daftarProduk = new Produk[5];

        daftarProduk[0] = new Produk("KD-01","Laptop Asus Vivobook OLED",9000000,5);
        daftarProduk[1] = new Produk("KD-02","USB HUB",150000,30);
        daftarProduk[2] = new Produk("KD-03","Laptop Lenovo Ideapad",4500000,15);
        daftarProduk[3] = new Produk("KD-04","Keyboard + Mouse Basic",180000,23);
        daftarProduk[4] = new Produk("KD-05","Monitor Skyworth",1700000,42);

        System.out.println("--- Toko Komputer Solvara ---");
        for (Produk pr : daftarProduk){
            pr.tampilkanData();
        }

        System.out.println("\n--- Halaman Pembelian ---");
        Produk p1 = daftarProduk[1];
        int beli1 = 18;
        System.out.println("Membeli: " + beli1 + " - " + p1.namaProduk);
        System.out.println("Stok Sebelum: " + p1.stok);
        if (p1.stok >= beli1) {
            System.out.println("Total Harga: " + p1.hitungTotalHarga(beli1));
        }
        p1.kurangiStok(beli1);
        System.out.println("Stok Sesudah: " + p1.stok);

        Produk p2 = daftarProduk[3];
        int beli2 = 25;
        System.out.println("\nMembeli: " + beli2 + " - " + p2.namaProduk);
        System.out.println("Stok Sebelum: " + p2.stok);
        if (p1.stok >= beli1) {
            System.out.println("Total Harga: " + p2.hitungTotalHarga(beli2));
        }
        p1.kurangiStok(beli1);
        System.out.println("Stok Sesudah: " + p2.stok);

        System.out.println("\n--- Produk Termahal ---");
        Produk termahal = daftarProduk[0];
        for (Produk pr : daftarProduk){
            if (pr.harga > termahal.harga){
                termahal = pr;
            }
        }
        System.out.println("Nama Produk: " + termahal.namaProduk);
        System.out.println("Harga: " + termahal.harga);
    }
}