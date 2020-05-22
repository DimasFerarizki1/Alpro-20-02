package ch05;

public class Responsi7B22C {
    public int kadaneForMaxSubArray(int[] arr) {
        int Besar = 0;
        int Terbesar = 0;
            for (int i = 0; i < arr.length; i++) {
            Besar += arr[i];
                if (Besar < 0) {
                    Besar = 0;
                }
                if (Terbesar < Besar) {
                Terbesar = Besar;
                }
    }
    return Terbesar;
 }

    public static void main(String args[]) {
        int arrayAngka[] = { 6, 1, -7, -3, 2, 5, 9, -1 };
        Responsi7B22C maxSum = new Responsi7B22C();
        System.out.println("Nilai Maximum subarray  " + maxSum.kadaneForMaxSubArray(arrayAngka));     
    }
}
    



