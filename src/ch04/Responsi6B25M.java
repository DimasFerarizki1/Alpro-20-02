package ch04;

public class Responsi6B25M {
    public static void main(String[] args) {
        
        //
        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int total = 0;
        System.out.println("Angka yang ada didalam array ini adalah : ");
        int i;
        //
        for (i = 0; i < 13; i++) {
            System.out.print(arrayAngka[i] + " ");
        }
        int selisih = arrayAngka[0] - arrayAngka[1];
        for (i = 0; i < 13; i++) {
            if (i == arrayAngka.length - 1) {
            } else {
                selisih = arrayAngka[i] - arrayAngka[i + 1];
                System.out.println("Hasil selisih dari " + arrayAngka[i] + " - " + arrayAngka[i + 1] + " = " + selisih);
                total = selisih + (selisih + 1);
            }
        }
    }
}