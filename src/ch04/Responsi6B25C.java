package ch04;

public class Responsi6B25C {
    public static void main (String []args){
    //
    int [] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 28, 55, 8, 32, 3};
    System.out.println ("Angka ganjil yang terdapat di array ini adalah = ");
    //
        for (int i = 0; i < 13; i++){
            if (arrayAngka[i] % 2!= 0) {
                    System.out.println(arrayAngka[i] );
            }
        }
    }
}