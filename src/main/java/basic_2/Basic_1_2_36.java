package basic_2;

public class Basic_1_2_36 {
    public static void main(String[] args) {
        int m = 3;
        int[][] a = fill();
        System.out.println("m = "+ m);
        System.out.print("a = ");print(a,a.length,a[0].length);
        System.out.println("The sums of squares = ");
        int[][] s = getSums(a,m);
        print(s,s[0].length,s[0].length);
    }
    private static int[][] fill() {
        int[][] x = {
                {1,2,3,4,5,6},
                {7,8,9,10,11,12},
                {13,14,15,16,17,18},
                {19,20,21,22,23,24},
                {25,26,27,28,29,30},
                {31,32,33,34,35,36}
                };
        return x;
    }
    private static int[][] getSums(int[][] a, int m) {
        int n = a.length, k = 0,l = 0,o = 0,p = 0;
        int[][] rowSum = new int[n][n-m+1];
        int[][] squareSum = new int[n-m+1][n-m+1];
        for(int i = 0; i < n;i++) {
            for(int j = 0; j < n;j++) {
                if (j>=m) {
                    l++;p++;
                    rowSum[k][l] = (rowSum[k][l-1] + a[i][j]) - a[i][j-m];
                    squareSum[o][p] += rowSum[k][l];
                } else {
                    rowSum[k][l] += a[i][j];
                    squareSum[o][p] += a[i][j];
                }
            }
            l = 0;p = 0;
            if (i>=m-1 && i != n-1) {
                o++;
                for(int s = 0; s < n-m+1;s++) {
                    squareSum[o][s] = squareSum[o - 1][s] - rowSum[k - m + 1][s];
                }
            }
            k++;
        }
        return squareSum;
    }
    private static void print(int[][] x,int n, int m) {
        System.out.println();
        for (int i = 0;  i<n; i++) {
            for (int j = 0;  j<m; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
