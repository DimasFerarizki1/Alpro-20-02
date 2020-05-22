package ch06;

public class Responsi10B25a {
    public static void main(String args[]){
        //
        int arrayAngka[] = {82, 12, 41, 38, 19, 26, 9, 48, 28, 55, 8, 32, 3};
        System.out.println("Sebelum menggunakan bubble sort");
        for(int k=0; k < 13; k++)
            System.out.print( arrayAngka[k]+"  ");
        System.out.println("");
        //
        int i,j,temp=0;
        for(i = 0; i < 13; i++){
            for(j = 1; j < 13-i; j++){
                if(arrayAngka[j-1] > arrayAngka[j]){
                    temp = arrayAngka[j-1];
                    arrayAngka[j-1]=arrayAngka[j];
                    arrayAngka[j]=temp;
                }
            }
        }
        System.out.println("Sesudah menggunakan Bubble sort");
        for(int k = 0; k <13; k++)
            System.out.print(arrayAngka[k]+"  ");
    }
}

