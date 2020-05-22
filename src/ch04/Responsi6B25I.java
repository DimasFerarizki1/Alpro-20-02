package ch04;

public class Responsi6B25I {
    public static void main (String [] args){
        //
        int [] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 28, 55, 8, 32, 3};
        int SelisihAngka;
        System.out.println();
        //
        for (int i = 0; i < 12; i++){
            SelisihAngka = arrayAngka[i] - arrayAngka[i + 1];
            System.out.println( "Selisih Angka = " + arrayAngka[i] + "-" + arrayAngka[i + 1] + " = " + SelisihAngka);
        }
    }
}

