package ch04;

public class Responsi6B25L {
    public static void main(String[] args) {
        int[] arrayAngka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.print("Jumlah angka dengan angka setelahnya yang hasil penjumlahannya bernilai genap = ");

        for (int i = 0; i < 13 - 1; i++){
            int jumlah = arrayAngka[i] + arrayAngka[i + 1];
                if (jumlah % 2 == 0)
                    System.out.print(jumlah + " ");
        }
    }
}

