package ch05;

public class Responsi7B21C {
    public static int FpB (int x, int y)
    {
        if (x == 0)
            return y;
        return FpB (y % x, x);
    }
    public static void main (String [] args) 
    {
       int x = 20;
       int y = 30, z;
       z = FpB (x,y);
       System.out.println("Hasil FpB dari angka (" + x + ", " + y + ") = " + z );
       
        }
    }

