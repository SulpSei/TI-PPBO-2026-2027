import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = sc.nextInt();

        System.out.println("\nTabel Perkalian " + bilangan);
        System.out.println("====================");

        for (int i = 1; i <= 10; i++) {
            int hasil = bilangan * i;
            System.out.println(bilangan + " x " + i + " = " + hasil);
        }

        sc.close();
    }
}