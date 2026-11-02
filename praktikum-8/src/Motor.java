public class Motor extends Kendaraan{
    protected String jenisMotor;

    public Motor(String merk, int kecepatanMaks, String jenisMotor) {
        super(merk, kecepatanMaks);
        this.jenisMotor = jenisMotor;
    }

    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan Maks: " + kecepatanMaks + "km/j");
        System.out.println("Jenis Motor: " + jenisMotor);
        System.out.println(" ");
    }
}
