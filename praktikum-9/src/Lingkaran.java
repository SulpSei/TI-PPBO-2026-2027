public class Lingkaran extends BangunDatar{
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    @Override
    public double hitungLuas() {
        System.out.println("Lingkaran = ");
        return Math.PI * radius * radius;
    }
}
