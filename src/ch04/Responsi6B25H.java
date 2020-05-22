package ch04;

public class Responsi6B25H {
   public static void total(int[]data){
        int TotalJumlah = 0;
        for (int i = 0; i < 13; i++) {
            TotalJumlah += data[i];
        }
        System.out.println("Jumlah dari Angka pada array = " + TotalJumlah);
    }

    public static void main(String[] args) {
        int arrayAngka[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};int Jumlah = 0;
        total(arrayAngka);
    }
}
    


    

