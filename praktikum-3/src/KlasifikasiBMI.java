import java.util.Scanner;

public class KlasifikasiBMI {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Berat Badan (kg): ");
        double berat = sc.nextDouble();
        System.out.print("Masukkan Tinggi Badan (cm): ");
        double tinggi  = sc.nextDouble();

        //Rumus Menghitung BMI (Body Mass Index)
        double bmi = berat / ((tinggi / 100) * (tinggi / 100));
        System.out.println("BMI: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi < 25) {
            System.out.println("Kategori: Normal");
        } else if (bmi < 30) {
            System.out.println("Kategori: Gemuk");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }
}
