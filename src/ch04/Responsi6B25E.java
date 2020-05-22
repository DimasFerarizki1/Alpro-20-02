package ch04;

public class Responsi6B25E {
    public static void main (String []args){
    //
    int [] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 28, 55, 8, 32, 3};
    System.out.println ("Angka-angka yang mempunyai angka 2 di dalam array = ");
    //
        for (int i = 0; i < 13; i++){
            if(String.valueOf(arrayAngka[i]).contains("2")){
                System.out.println(arrayAngka[i]);
            }            
        }
    }
}