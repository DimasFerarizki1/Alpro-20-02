package ch04;

public class Responsi6B25G {
    public static void main (String [] args){
        //
        int [] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 28, 55, 8, 32, 3};
        System.out.println("Angka kelipatan lima yang terdapat di Array ini adalah = ");
        //
        for (int i = 5; i < 13; i++){
            if (arrayAngka[i] %5==0){
                 System.out.println(arrayAngka[i]);
            }     
        }
           
    }
}

