package ch07;

public class Responsi11B25c {
    public static void main(String[] args) {
        int [] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32,3};
        boolean urutan = true;
        while(urutan == true){
            for (int i=0; i <13-1; i++){
                if(arrayAngka[i] > arrayAngka[i+1]){
                    int baru = arrayAngka[i];
                    arrayAngka[i] = arrayAngka[i+1];
                    arrayAngka[i+1] = baru;
                }
            }
            if (urutan == false)
                break;
            urutan = false;
            int j = 13-1;
            for (int i = j-1; i >= 0; i--){
                if (arrayAngka[i] > arrayAngka[i+1]){
                    int baru = arrayAngka[i];
                        arrayAngka[i] = arrayAngka[i+1];
                        arrayAngka[i+1] = baru;
                        urutan = true;
                }
            }
        }
        System.out.println ("Angka Setelah Diurutkan dengan Algoritma Cocktail Shaker Sort : ");
        for (int i = 0; i < arrayAngka.length; i++){
            System.out.print(arrayAngka[i]+", ");
        }
    }
}
