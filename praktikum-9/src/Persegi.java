public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        System.out.println("Persegi = ");
        return sisi * sisi;
    }
}
