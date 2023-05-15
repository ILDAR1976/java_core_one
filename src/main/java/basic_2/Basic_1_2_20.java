package basic_2;

public class Basic_1_2_20 {
    public static void main(String[] args) {
        int[] x = new int[5];
        int[] y = new int[5];
        fill(x);fill(y);
        System.out.print("x = ");print(x);
        System.out.print("y = ");print(y);
        System.out.print("r = ");print(glue(x,y));
    }
    private static void fill(int[] x) {
        x[0] = (int)(Math.random()/Math.nextDown(1.0) * 10);
        for (int i = 1;  i<x.length; i++) {
            while (x[i]<x[i-1]) {
                x[i] = (int)(Math.random() * 100);
                if (x[i] > 10 + x[i-1]) {
                    x[i] = 0;
                    continue;
                }
            }
        }
    }
    private static int[] glue(int[] x, int[] y) {
        int k = x.length, l = y.length;
        int k1 = 0,l1 = 0;
        int[] z = new int[x.length+y.length];

        //invariant: invariant : the answer is obtained if to
        // z [0] ... z [k1+l1] add to the right, join the
        // arrays x [k1+ 1] ... x [k] and y [l1+ 1] ... y [l]
        while ((k1 != k) || (l1 != l)) {
            if (k1 == k) {
                //l1 < l
                l1++;
                z[k1+l1-1]=y[l1-1];
            } else if (l1 == l) {
                //k1 < k
                k1++;
                z[k1+l1-1]=x[k1-1];
            } else if (x[k1] <= y[l1]) {
                k1++;
                z[k1+l1-1]=x[k1-1];
            } else if (x[k1] >= y[l1]) {
                l1++;
                z[k1+l1-1]=y[l1-1];
            } else {
                //there is no such thing
            }
        }
        //k1 = k,l1=k,arrays are glued together
        return z;
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
}
