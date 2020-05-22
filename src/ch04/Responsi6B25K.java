package ch04;

public class Responsi6B25K {
    public static void main(String[] args) {
        int[] arrayAngka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
		//
        for (int i = 0; i < 12; i++){
            int j = i + 1;
            int k = arrayAngka[j];
                if (arrayAngka[i] < k){
                    System.out.println(arrayAngka[j]);
            }
        }
    }
}