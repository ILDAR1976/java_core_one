package basic_2;

public class Basic_1_2_21 {
    public static void main(String[] args) {
        int[] x = new int[15];
        int[] y = new int[15];
        fill(x);fill(y);
        System.out.print("x = ");print(x);
        System.out.print("y = ");print(y);
        System.out.print("r = ");print(intersection(x,y));
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
    private static int[] intersection(int[] x, int[] y) {
        int k = x.length, l = y.length;
        int k1 = 0,l1 = 0,zc = 0,tmp = 0;
        int[] z = new int[Math.max(x.length,y.length)];
        while ((k1 != k) || (l1 != l)) {
            if (k1 == k) {
                l1++;
            } else if (l1 == l) {
                k1++;
            } else if (x[k1] <= y[l1]) {
                int cp1 = x[k1],cp2 = y[l1];
                k1++;
                if (cp1 == cp2 && x[k1-1] != tmp) {
                    tmp = x[k1-1];
                    z[zc++]=x[k1-1];
                }

            } else if (x[k1] >= y[l1]) {
                int cp1 = x[k1],cp2 = y[l1];
                l1++;
                if (cp1 == cp2  && y[l1-1] != tmp) {
                    tmp = y[l1-1];
                    z[zc++]=y[l1-1];
                }

            } else {
                //there is no such thing
            }
        }
        return z;
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
}
