package basic_2;

public class Basic_1_2_18 {
    public static void main(String[] args){
        int[] x = new int[10];
        int[] y = new int[10];
        fill(x);fill(y);
        System.out.print("x = ");print(x);
        System.out.print("y = ");print(y);
        System.out.print("The quantity of common elements = ");
        System.out.print(common(x,y));
    }

    private static void fill(int[] x) {
        x[0] = (int)(Math.random() * 100);
        for (int i = 1;  i<x.length; i++) {
            while (x[i]<x[i-1]) {
                x[i] = (int)(Math.random() * 100);
            }
        }
    }

    private static int common(int[] x, int[] y) {
        int k = x.length - 1, l = y.length - 1;
        int k1 = 0, l1 = 0, n = 0, t = 0;
        //invariant : 0<=k1<=k ; 0<=l 1<=l ;
        // the desired answer = n + the number of common elements
        // in x [k1+ 1] . . x [k] и y [l 1+ 1] . . y [l] }
        while ((k1 != k) && (l1 != l)) {
            if (x[k1+1] < y[l1+1]) {
                k1++;
            } else if (x[k1+1] > y[l1+1]){
                l1++;
            } else {
                // x[k1+1] == y[l1+1]
                if (k1+1 == k) {
                    k1++;n++;
                } else if (x[k1+1] == x[k1+2]) {
                    k1++;
                } else {
                    k1++;n++;
                }
            }
        }
        //k1 = k or l 1 = l , so one of the sets mentioned
        // in the invariant is empty, and n equals the sought answer
        return n;
    }

    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
}
