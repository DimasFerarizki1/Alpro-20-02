package ch03;
import java.util.Scanner;

public class Responsi5B44b {
     public static void main (String [] args){
        Scanner input = new Scanner (System.in);
            
            System.out.print("Masukkan nilai X = ");
            int x = input.nextInt();
            
            System.out.print("Masukkan nilai Y = ");
            int y = input.nextInt();
            
            System.out.print("Masukkan nilai Z = ");
            int z = input.nextInt();
            
            //percabangan
            
            if (x > y && x > z ){  
                System.out.println("Nilai X lebih besar");
                
            } else if (y > x && y > z){
                 System.out.println("Nilai Y lebih besar");
                 
             } else if (z > x && z > y){
                 System.out.println("Nilai z lebih besar");
                 
            }      
    }
}
