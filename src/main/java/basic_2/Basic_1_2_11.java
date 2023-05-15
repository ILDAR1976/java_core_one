package basic_2;

public class Basic_1_2_11 {
    public static void main(String[] args){
        int[] x = new int[17];
        int l = x.length;
        fill(x);
        System.out.print("x = ");print(x);
        revers(x,l/2+2,l/2+1-2);
        System.out.print("x = ");print(x);
    }
    private static void fill(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            x[i] = (int)(Math.random() * 100);
        }
    }
    private static void revers(int[] x, int n, int m){
        int p = 0, q = m, r = m + n;
        int pnew = 0, qnew = 0, rnew = 0;
        while ( (p != q) && (q != r) ) {
            if ( (q-p) <= (r-q)) {
                exchange(x,p+1,q,q+1,q+(q-p));
                pnew = q; qnew = q + (q - p);
                p = pnew; q = qnew;
            } else {
                exchange(x,q-(r-q)+1,q,q+1,r);
                qnew = q - (r - q); rnew = q;
                q = qnew; r = rnew;
            }
        }
    }
    private static void exchange(int[] x, int a, int b, int c, int d){
        int i = a - 1,j = c - 1,tmp = 0;
        while (i < b) {
            tmp = x[i];
            x[i] = x[j];
            x[j] = tmp;
            i++;j++;
        }
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
}
