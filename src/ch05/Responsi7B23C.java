package ch05;


public class Responsi7B23C {
    int lcs (char[] P, char[] Q, int a, int b)
    {
        int C [][] = new int [a + 1][b + 1]; 
        //
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++){
                if (i==0 || j==0)
                    C[i][j] = 0;
                else if (P[i-1] == Q[j-1])
                    C[i][j] = C[i-1][j-1] + 1;
                else
                    C[i][j] = max(C[i-1][j], C[i][j-1]);
                
            }
        }
            return C [a][b];
    }       

    int max (int m, int n)
    {
        return (m > n) ? m : n;
    }
    
    public static void main (String [] args)
    {
        Responsi7B23C lcs = new Responsi7B23C();
        String s1 = "DIMASAFE";
        String s2 = "EFASEDIM";
        //
        char [] P = s1.toCharArray();
        char [] Q = s2.toCharArray();
        int a = P.length;
        int b = Q.length;
        System.out.println("Length of LCS"  + lcs.lcs(P, Q, a, b));
    }
}

