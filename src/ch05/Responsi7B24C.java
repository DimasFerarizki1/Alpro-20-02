package ch05;

class Responsi7B24C 
{ 
    static int lis(int arrayAngka[],int n) 
    { 
          int lis[] = new int[n]; 
          int i,j,maksimal = 0; 
          //
           for ( i = 0; i < n; i++ ) 
              lis[i] = 1; 
          //
           for ( i = 1; i < n; i++ ) 
              for ( j = 0; j < i; j++ )  
                         if ( arrayAngka[i] > arrayAngka[j] && lis[i] < lis[j] + 1) 
                    lis[i] = lis[j] + 1; 
          //
           for ( i = 0; i < n; i++ ) 
              if ( maksimal < lis[i] ) 
                 maksimal = lis[i]; 
            return maksimal; 
    } 
  
    public static void main(String args[]) 
    { 
        int arrayAngka[] = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
            int n = arrayAngka.length; 
            System.out.println("Long Increase Subsquence-nya adalah =  " + lis( arrayAngka, n ) + "\n" ); 
    } 
}

