package basic_2;

public class Basic_1_2_22 {
    public static void main(String[] args) {
        int q = (int)(Math.random()*100);
        int[] x = new int[15];
        int[] y = new int[15];
        fill(x);fill(y);
        System.out.println("q = " + q);
        System.out.print("x = ");print(x);
        System.out.print("y = ");print(y);

        System.out.print("r = ");print(different(x,y,q));
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
    private static int[] different(int[] x, int[] y, int q) {
        int k = x.length, l = y.length;
        int k1 = 0,l1 = 0,zc = 0,tmp = 100;
        int[] z = new int[3];
        while ((k1 != k) || (l1 != l)) {
            if (k1 == k) {
                l1++;
            } else if (l1 == l) {
                k1++;
            } else if (x[k1] <= y[l1]) {
                int cp1 = x[k1],cp2 = y[l1],diff = Math.abs(q - (cp1+cp2));
                k1++;
                if (tmp > diff) {
                    tmp = diff;
                    z[0] = cp1;z[1] = cp2;z[2] = tmp;
                }

            } else if (x[k1] >= y[l1]) {
                int cp1 = x[k1],cp2 = y[l1],diff = Math.abs(q - (cp1+cp2));
                l1++;
                if (tmp > diff) {
                    tmp = diff;
                    z[0] = cp1;z[1] = cp2;z[2] = tmp;
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
