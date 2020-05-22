package ch04;
import java.util.Scanner;

public class Responsi6B25B{
    public static void main (String []args){
    //
    int [] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 28, 55, 8, 32, 3};
    Scanner array = new Scanner (System.in);
    System.out.println ("Masukkan Angka yang diinginkan = ");
    int bilangan = array.nextInt();
    //
        for (int i = 0; i < 13; i++){
            if (arrayAngka[i] == bilangan) {
                System.out.println("Angka ditemukan pada indeks " + i );
                    break;
            }
        }
    }
}