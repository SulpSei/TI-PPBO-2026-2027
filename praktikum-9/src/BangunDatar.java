public class BangunDatar {
    protected String namaBangun;

    public BangunDatar(String namaBangun) {
        this.namaBangun = namaBangun;
    }

    public double hitungLuas() {
        return 0;
    }
    public double hitungKeliling() {
        return 0;
    }

    public void tampilkanInfo() {
        System.out.println(namaBangun + " | Luas: " + hitungLuas() + " | Keliling: " + hitungKeliling());
    }

    public String getNamaBangun() {
        return namaBangun;
    }
}
