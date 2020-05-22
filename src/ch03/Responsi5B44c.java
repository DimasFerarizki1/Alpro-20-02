package ch03;
import java.util.Scanner;

public class Responsi5B44c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Angka:");
        int angka = input.nextInt();
        int faktor = 2;
        System.out.println("Faktor Terkecil dari " + angka + " = " );

        for (int i = 0; i < angka; i++) {
            faktor++;
            if (angka % faktor == 0) {
                System.out.println(faktor);
                break;
            }

        }
    }
}