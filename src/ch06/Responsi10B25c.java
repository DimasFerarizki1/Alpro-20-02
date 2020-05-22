package ch06;

public class Responsi10B25c {
    public static void main(String[] args) {
        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for (int i = 0; i < 13-1; i++){
            int terkecil = i;
            for (int j = i+1; j < 13; j++){
                if (arrayAngka[j] < arrayAngka[terkecil]){
                    terkecil = j;
                    int urutan = arrayAngka[terkecil];
                    arrayAngka[terkecil] = arrayAngka [i];
                    arrayAngka[i] = urutan;
                }
            }
        }
        for (int i = 0; i < 13; i++){
        System.out.print(arrayAngka[i]);
        }
    }
}