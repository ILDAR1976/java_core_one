package basic_3;

public class Basic_1_3_2 {
    public static void main(String[] args) {
        int[] x = fill1();
        int[] y = fill2();
        System.out.print("x = ");print(x);
        System.out.print("y = ");print(y);
        System.out.println("The sequence y is subsequence the sequence x ? " + ((isSubsequence(x,y))?"yes":"no"));
    }
    private static int[] fill1() {
        int[] x =  {0,1,2,3,4,0};
        return x;
    }
    private static int[] fill2() {
        int[] x =  {0,2,4};
        return x;
    }

    private static boolean isSubsequence(int[] x,int[] y) {
        int n = x.length-1,k = y.length-1,n1 = n,k1 = k;
        boolean s = false;

        while ( (n1 > 0) && (k1>0)) {
            if (x[n1] == y[k1]) {
                n1--;
                k1--;
            } else {
                n1--;
            }
        }

        return (k1==0);
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
}
