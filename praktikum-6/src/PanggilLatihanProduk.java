public class PanggilLatihanProduk {
    public static void main(String[] args){
        LatihanProduk produk1 = new LatihanProduk("Laptop ROG",20000000);
        LatihanProduk produk2 = new LatihanProduk("Laptop Ideapad", 4800000);

        double batas = 5000000;

        System.out.println("Apakah Mahal? " + produk1.isMahal(batas));
        System.out.println("Apakah Mahal? " + produk2.isMahal(batas));
    }
}
