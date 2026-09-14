public class KonversiNilai {
    public static void main(String[] args) {
        int nilai = 78;
        char huruf;

        //85.70.55 A.B.C.E

        if (nilai >= 85) {
            huruf ='A';
        } else if (nilai >= 70){
            huruf ='B';
        } else if (nilai >= 55){
            huruf ='C';
        } else {
            huruf ='E';
        }

        System.out.println("Nilai Huruf: " + huruf);
    }
}
