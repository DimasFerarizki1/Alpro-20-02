package ch06;

public class Responsi10B25b {
   public static void main(String[] args) {
        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Angka setelah diurutkan");
        for (int i = 0; i < 13; i++) {
            int urutan = arrayAngka [i];
            int j = i-1;
			//
            while (j >= 0 && arrayAngka[j] > urutan) {
                arrayAngka [j+1] = arrayAngka[j];
                arrayAngka[j] = urutan;
                j = j-1;
            }
        }
        for (int i = 0; i < 13; i++) {
            System.out.println(arrayAngka[i]);
        }
    }
}

