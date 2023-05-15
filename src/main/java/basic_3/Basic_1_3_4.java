package basic_3;

public class Basic_1_3_4 {
    public static void main(String[] args) {
        int[] x = fill();
        System.out.print("x = ");print(x);
        System.out.println("The maximum length of subsequence is " + findLIS(x));
    }
    private static int[] fill() {
        int[] x =  {0,1,0,5,0,0,1,2,3,4,0,3,2,3,4,5,6,0};
        return x;
    }
    private static int binarySearch(int[] x, int q){
        int n = x.length - 1,l = 0, r = n, m = 0;
        while (r-l != 0) {
            m = l + (r-l) / 2;
            if (x[m] <= q) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        m = l + (r-l) / 2;
        return (x[m] >= q)?m:-1;
    }


    private static int findLIS(int[] x) {
        int n = x.length;
        int[] d = new int[n];
        int[] pos  = new int[n];
        int[] prev = new int[n];
        int length = 0;

        pos[0] = -1 ;
        d[0] = (int) Double.NEGATIVE_INFINITY;
        for (int i = 1; i<n;i++) d[i]= (int) Double.POSITIVE_INFINITY;
        int j = 0;
        for (int i = 0; i<n;i++){
            j = binarySearch(d,x[i]);
            if ((d[j-1] < x[i]) && (x[i] < d[j])) {
                d[j] = x[i];
                pos[j] = i;
                prev[i] = pos[j-1];
                length = Math.max(length, j);
            }
        }
        return length;
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
}
