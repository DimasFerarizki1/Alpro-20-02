package ch04;

import java.util.jar.JarOutputStream;

public class Responsi6B25N{
    public static void main(String[] args) {

        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int jumlah = 0;
        for (int i = 0; i < 13; i++) {
            for (int array : arrayAngka) {
                if (arrayAngka[i] < arrayAngka.length) {
                    jumlah = arrayAngka.length - arrayAngka[i];
                }
            }
            System.out.println("Jumlah angka sebelum " + arrayAngka[i] + " = " + jumlah);
        }
    }
} 

