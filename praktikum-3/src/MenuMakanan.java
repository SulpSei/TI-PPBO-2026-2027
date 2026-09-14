import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("==Menu==");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Bakso");
        System.out.println("4. Mie Aceh");

        System.out.print("Pilih Makanan (1-4): ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda Memilih Nasi Goreng");
                break;
            case 2:
                System.out.println("Anda Memilih Mie Ayam");
                break;
            case 3:
                System.out.println("Anda Memilih Bakso");
                break;
            case 4:
                System.out.println("Anda Memilih Mie Aceh");
                break;
            default:
                System.out.println("Pilihan Tidak Tersedia");
        }
    }
}
