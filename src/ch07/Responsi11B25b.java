package ch07;

public class Responsi11B25b {
    public static void main(String []args) {
        int arrayAngka[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32,3};
        System.out.println("Angka sebelum diurutkan ");
        for(int i = 0; i < 13; i++)
        {
        System.out.print(arrayAngka[i]+ " ");
        }
        //
        urutan(arrayAngka,0,13-1);
        System.out.println();
        System.out.println( "Angka setelah diurutkan dengan merge sort = " );
        for(int i = 0; i < 13; i++)
        {
        System.out.print(arrayAngka[i]+ " " );
        }
    }
    public static void urutan (int arrayAngka[], int a, int b) {
        int kecil = a;
        int besar = b;
        if (kecil >= besar)
        {
            return;
        }
        int tengah = (kecil + besar) / 2;
        urutan (arrayAngka,kecil,tengah);
        urutan (arrayAngka,tengah+1,besar);
        int end_kecil = tengah;
        int awal = tengah + 1;
        while ((a <= end_kecil ) && ( awal <= besar))
        {
            if (arrayAngka[kecil] <arrayAngka [awal])
            {
                kecil++;
            }
            else
            {
                int baru = arrayAngka[awal];
                for (int k = awal-1; k>=kecil; k--)
                {
                    arrayAngka[k+1] = arrayAngka[k];
                }
                arrayAngka [kecil] = baru;
                kecil++;
                end_kecil++;
                awal++;
            }
        }
    }
    
}
