package ch03;
import java.util.Scanner;

public class Responsi5B44d {
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        int x, y, nilai;
        boolean prima;
        System.out.println("Masukkan angka : ");
        nilai = input.nextInt();
        while (nilai<= 1)
        {
            System.out.println("Nilai harus lebih besar dari 1 Masukkan nilai : ");
            nilai = input.nextInt();
        }
        for (x=nilai;x<=nilai;x++)
        {
            prima=false;
            if (x==2)
                prima=true;
            else
            {
                for (y=2;y<x;y++)
                {
                    if (x % y==0)
                    {
                        prima=false;
                        System.out.println ("Bukan Bilangan Prima");
                        break;
                    }
                    else
                        prima=true;
                }
            }
            if (prima)
            {
                System.out.println("Termasuk Bilangan Prima");

            }
        }

    }
}