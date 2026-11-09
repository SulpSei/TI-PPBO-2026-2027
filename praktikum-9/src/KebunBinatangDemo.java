public class KebunBinatangDemo {
    public static void main(String[] args) {
        Kucing k1 = new Kucing("Meng");
        Anjing a1 = new Anjing("Beki");

        Hewan h1 = new Kucing("Milo");
        Hewan h2 = new Anjing("Rex");

        h1.bersuara();
        h2.bersuara();
    }
}
