import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Suhu Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Suhu Fahrenheit: " + fahrenheit);
        System.out.println("Jadi suhu " + celsius + "°C sama dengan " + fahrenheit + "°F");

        sc.close();
    }
}
