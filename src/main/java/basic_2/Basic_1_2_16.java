package basic_2;

public class Basic_1_2_16 {
    public static void main(String[] args){
        int n = 6;
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[a.length+b.length];
        fill(a);fill(b);
        System.out.print("a = ");print(a);
        System.out.print("b = ");print(b);
        karatsuba(a,b);
    }
    private static void fill(int[] a) {
        for (int i = 0;  i<a.length; i++) {
            a[i] = (int)(Math.random() * 100);
        }
    }
    private static void handmadeFill1(int[] a) {
        int[] ha = {2,3,4,5,7,3};
        for (int i = 0;  i<a.length; i++) {
            a[i] = ha[i];
        }
    }
    private static void handmadeFill2(int[] a) {
        int[] ha = {1,2,3,4,8,5};
        for (int i = 0;  i<a.length; i++) {
            a[i] = ha[i];
        }
    }
    private static void karatsuba(int[] m, int[] l){
        int n = m.length, k = n / 2;
        int[] a = let(m,0,k);
        int[] b = let(m,k,n);
        int[] c = let(l,0,k);
        int[] d = let(l,k,n);

        int[] ac = mull(a,c);
        int[] bd = mull(b,d);

        int[] sab = sum(a,b);
        int[] scd = sum(c,d);

        int[] bigMull = sub(sub(mull(sab,scd),ac),bd);

        int[] r = sum(sum(shift(ac,n),shift(bigMull,n/2)),shift(bd,0));
        System.out.print("c = ");print(r);
    }
    private static int[] let(int[] a,int s, int e) {
        int n = e-s, j = 0;
        int[] b = new int[n];
        for (int i = s; i < e; i++) {
            b[j] = a[i];j++;
        }
        return b;
    }
    private static int[] sum(int[] a,int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        return c;
    }
    private static int[] sub(int[] a,int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] - b[i];
        }
        return c;
    }
    private static int[] mull(int[] a,int[] b) {
        int[] c = new int[a.length+b.length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b.length; j++)
                c[i + j] += a[i] * b[j];
        return c;
    }
    private static int[] shift(int[] a,int n){
        int[] b = new int[a.length*2];int j, d;
        if (n==0) {
            j = b.length - 1;
            d = -1;
        } else {
            j = b.length - n;
            d = 0;
        }
        for (int i = a.length-1+d; i >= 0; i--){
            b[j--] = a[i];
        }
        return b;
    }
    private static void print(int[] a) {
        for (int i = 0; i < a.length ; i++) {
            System.out.print(((i!=0)?"+":"") + a[i] + "*x^"+ (a.length-i-1) );
        }
        System.out.println();
    }
}
