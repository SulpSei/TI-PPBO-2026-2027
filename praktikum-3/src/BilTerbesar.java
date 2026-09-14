import java.util.Scanner;

public class BilTerbesar {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Bilangan Bulat Pertama: ");
        int a = sc.nextInt();
        System.out.print("Masukkan Bilangan Bulat Kedua: ");
        int b = sc.nextInt();
        System.out.print("Masukkan Bilangan Bulat Ketiga: ");
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("Bilangan terbesar: " + a);
            } else {
                System.out.println("Bilangan terbesar: " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Bilangan terbesar: " + b);
            } else {
                System.out.println("Bilangan terbesar: " + c);
            }
        }

    }
}
