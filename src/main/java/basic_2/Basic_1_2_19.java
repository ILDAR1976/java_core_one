package basic_2;

public class Basic_1_2_19 {
    public static void main(String[] args){
        int[] x = new int[4];
        int[] y = new int[4];
        fill(x);fill(y);
        System.out.print("x = ");print(x);
        System.out.print("y = ");print(y);
        System.out.print("The quantity of common elements = ");
        System.out.print(common(x,y));
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

    private static int common(int[] x, int[] y) {
        int k = x.length - 1, l = y.length - 1;
        int k1 = 0, l1 = 0, n = 0, t = 0;
        int m1 = 1, p1 = 1, d = 1, f=1;
        while ((k1 != k) && (l1 != l)) {
            if ((m1 <= k) || (p1 <= l)) {
                if (x[m1] != x[m1 - 1]) d++;
                if (y[p1] != y[p1 - 1]) f++;
                m1++;p1++;
            }

            if (x[k1+1] < y[l1+1]) {
                k1++;
            } else if (x[k1+1] > y[l1+1]){
                l1++;
            } else {
                if (k1+1 == k) {
                    k1++;n++;
                } else if (x[k1+1] == x[k1+2]) {
                    k1++;
                } else {
                    k1++;n++;
                }
            }
        }

        if (d == 1 || f == 1) {
            if (f == 1) return d+f - n;
            if (d == 1) return f+d - n;
            if (d == 1 && f == 1 ) return k + l - n;
        }  else {
            return d+f-n;
        }
        return 0;
    }

    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
}
