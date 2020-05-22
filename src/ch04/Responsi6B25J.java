package ch04;

public class Responsi6B25J {
    public static void main(String[] args) {
        int[] arrayAngka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int selisih = 0;
        for (int i = 0; i < arrayAngka.length; i++){
            if (arrayAngka[i] % 2 == 0){
                for (int j = i + 1; j < arrayAngka.length; j++)
                    if (arrayAngka[j] % 2 == 0){
                        selisih = arrayAngka[i] - arrayAngka[j];
                        System.out.println(arrayAngka[i] + " - " + arrayAngka[j] + " = " +selisih);
                    }
            }
        }
    }
}
 
