import java.util.Scanner;

public class DiskonTiketBioskop {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Umur: ");
        int umur = sc.nextInt();
        System.out.print("Apakah Anda Mahasiswa?(true/false): ");
        boolean mahasiswa  = sc.nextBoolean();

        if (mahasiswa && umur < 25){
            System.out.println("Harga Tiket: 20.000");
        } else {
            System.out.println("Harga Tiket: 40.000");
        }
    }
}
