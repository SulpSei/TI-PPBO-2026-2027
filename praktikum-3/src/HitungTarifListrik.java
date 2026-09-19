import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        final double tarif450 = 415;
        final double tarif900 = 1352;
        final double tarif1300 = 1444.70;
        final double tarif2200 = 1444.70;
        final double tarifDiAtas2200 = 1699.53;

        System.out.println("==Golongan Daya Listrik Dalam VA==");
        System.out.println("1. 450");
        System.out.println("2. 900");
        System.out.println("3. 1300");
        System.out.println("4. 2200");
        System.out.println("5. Di atas 2200 VA");

        System.out.print("Pilih Golongan (1-5): ");
        int pilihan = sc.nextInt();

        System.out.print("Masukkan pemakaian listrik (kWh): ");
        double kWh = sc.nextDouble();

        if (kWh < 0 || kWh == 0) {
            System.out.println("Pemakaian listrik harus lebih dari 0 kWh.");
        } else {
            double tarif = 0;
            String golongan = "";

            switch (pilihan) {
                case 1:
                    golongan = "450 VA";
                    tarif = tarif450;
                    break;
                case 2:
                    golongan = "900 VA";
                    tarif = tarif900;
                    break;
                case 3:
                    golongan = "1300 VA";
                    tarif = tarif1300;
                    break;
                case 4:
                    golongan = "2200 VA";
                    tarif = tarif2200;
                    break;
                case 5:
                    golongan = "Di atas 2200 VA";
                    tarif = tarifDiAtas2200;
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
                    sc.close();
                    return;
            }

            double total = kWh * tarif;

            System.out.println("\n== Hasil Perhitungan ==");
            System.out.println("Golongan Daya : " + golongan);
            System.out.println("Pemakaian     : " + kWh + " kWh");
            System.out.println("Tarif         : Rp " + tarif);
            System.out.printf("Total Tagihan : Rp %.2f%n", total);
        }
    }
}
