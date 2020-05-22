package ch03;
import java.util.Scanner;

public class Responsi5B44a {
    
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
            System.out.print("Masukkan nilai X =");
            int x = input.nextInt();
            System.out.print("Masukkan nilai Y =");
            int y = input.nextInt();
			
            //percabangan
            if (x > y) {
                System.out.println("Nilai X lebih besar");
            } else if (y > x) {
                System.out.println("Nilai y lebih besar");
            }
    }
    
}