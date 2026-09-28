public class BreakContinueDemo {
    public static void main(String[] args){
        System.out.println("Menggunaka Break:");
        for (int i =1; i <= 10; i++){
            if (i == 5){
                break; //Loop Langsung Berhenti Total
            }
            System.out.println(i);
        }

        System.out.println("Menggunakan Countinue:");
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0){
                continue; //Lewati Angka Genap, Lanjut Ke Iterasi
            }
            System.out.println(i);
        }
    }
}
