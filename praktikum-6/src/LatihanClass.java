public class LatihanClass {
    public static void main(String[] agrs) {

        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa("Siti","67890",3.90);

        m2.tampilkanData();
        System.out.println("Cumlaude? " + m2.isCumlaude());
    }
}
