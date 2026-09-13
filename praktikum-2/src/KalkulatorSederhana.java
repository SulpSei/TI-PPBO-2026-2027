import java.util.Scanner;

public class KalkulatorSederhana{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Membaca dua bilangan bulat
        System.out.print("Input bil pertama: ");
        int bilangan1 = input.nextInt();

        System.out.print("Input bil kedua: ");
        int bilangan2 = input.nextInt();

        // Menampilkan hasil operator aritmatika
        System.out.println("\n=== Operator Aritmatika ===");
        System.out.println("Penjumlahan (+) : " + (bilangan1 + bilangan2));
        System.out.println("Pengurangan (-) : " + (bilangan1 - bilangan2));
        System.out.println("Perkalian (*)   : " + (bilangan1 * bilangan2));
        System.out.println("Pembagian (/)   : " + ((double) bilangan1 / bilangan2));
        System.out.println("Sisa Bagi (%)   : " + ((double) bilangan1 % bilangan2));

        // Menampilkan hasil perbandingan
        System.out.println("\n=== Operator Perbandingan ===");
        System.out.println("Bilangan pertama > bilangan kedua  : " + (bilangan1 > bilangan2));
        System.out.println("Bilangan pertama < bilangan kedua  : " + (bilangan1 < bilangan2));
        System.out.println("Bilangan pertama == bilangan kedua : " + (bilangan1 == bilangan2));

        input.close();
    }
}

