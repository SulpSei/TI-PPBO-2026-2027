public class ArrayPersegi {
    public static void main(String[] args){
        Persegi[] daftarSisiPersegi = new Persegi[4];

        daftarSisiPersegi[0] = new Persegi(23);
        daftarSisiPersegi[1] = new Persegi(78);
        daftarSisiPersegi[2] = new Persegi(96);
        daftarSisiPersegi[3] = new Persegi(54);

        for (Persegi p : daftarSisiPersegi){
            System.out.println("Sisi: " + p.sisi);
            System.out.println("Luas Persegi: " + p.hitungLuas());
        }

        Persegi terbesar = daftarSisiPersegi[0];
        for (Persegi p : daftarSisiPersegi){
            if (p.hitungLuas() > terbesar.hitungLuas()){
                terbesar = p;
            }
        }

        System.out.println(" ");
        System.out.println("--- Luas Persegi Terbesar ---");
        System.out.println("Sisi: " + terbesar.sisi);
        System.out.println("Luas Persegi: " + terbesar.hitungLuas());
    }
}
