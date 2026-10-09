public class KonversiSuhu {

    static double konversiSuhu(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    static double konversiSuhu(double celsius, String skalaTujuan) {
        if (skalaTujuan.equalsIgnoreCase("fahrenheit")) {
            return (celsius * 9.0 / 5.0) + 32;
        } else if (skalaTujuan.equalsIgnoreCase("kelvin")) {
            return celsius + 273.15;
        } else {
            System.out.println("Skala tidak dikenal: " + skalaTujuan);
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Konversi ke Fahrenheit (1 parameter) ===");
        System.out.printf("0 C   -> %.2f F%n", konversiSuhu(0));
        System.out.printf("100 C -> %.2f F%n", konversiSuhu(100));
        System.out.printf("37 C  -> %.2f F%n", konversiSuhu(37));

        System.out.println("\n=== Konversi dengan skala tujuan (2 parameter) ===");
        System.out.printf("0 C   -> %.2f F%n", konversiSuhu(0, "fahrenheit"));
        System.out.printf("0 C   -> %.2f K%n", konversiSuhu(0, "kelvin"));
        System.out.printf("100 C -> %.2f K%n", konversiSuhu(100, "kelvin"));
        System.out.printf("37 C  -> %.2f F%n", konversiSuhu(37, "fahrenheit"));
    }
}