package basic_3;

public class Basic_1_3_3 {
    public static void main(String[] args) {
        int[] x = fill1();
        int[] y = fill2();
        System.out.print("x = ");print(x);
        System.out.print("y = ");print(y);
        System.out.println("The length of longest common subsequence: " + maxSubsequence(x,y));
    }
    private static int[] fill1() {
        int[] x =  {6,1,2,4,3,2};
        return x;
    }
    private static int[] fill2() {
        int[] x =  {1,4,2};
        return x;
    }

    private static int maxSubsequence(int[] x, int[] y) {
        int n = x.length,m = y.length;
        int[][] l = new int[n+1][m+1];

        for(int i = 1; i <= n; i++)
            for(int j = 1; j <= m; j++)
                if (x[i-1] == y[j-1])
                    l[i][j] = 1 + l[(i-1)][j-1];
                else
                    l[i][j] = Math.max(l[(i-1)][j],l[i][j-1]);


        return l[n][m];
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
}
