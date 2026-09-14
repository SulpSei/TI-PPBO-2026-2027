import java.util.Scanner;

public class BilGanjilGenap {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Bilangan Bulat: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0){
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }

    }
}
