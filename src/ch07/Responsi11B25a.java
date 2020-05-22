package ch07;

public class Responsi11B25a {
     public static void main(String[] args) {
        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Angka Sebelum diurutkan");
        for (int i = 0; i < 13;i++ ) {
            System.out.print(arrayAngka[i] + " ");
        }
        //
        System.out.println(" ");
        System.out.println("Angka Setelah menggunakan algortima Block Sort :  ");
        //
        for (int i = 1; i < 13; i++) {
            int n = arrayAngka[i];
            int j = i - 1;
            while ((j > -1) && (arrayAngka[j] > n)) {
                arrayAngka[j + 1] = arrayAngka[j];
                j--;
            }
            arrayAngka[j + 1] = n;
        }
        for (int n : arrayAngka) {
        System.out.print(n + " ");
        //
        }
    }
} 

