package basic_2;

public class Basic_1_2_13 {
    public static void main(String[] args){
        //Gurner scheme
        double x = 2;
        int[] a = new int[4];
        //fill(a);
        handmadeFill(a);
        System.out.print("a = ");print(a,x);
        gurner(a,x);
        //revers(a);
        //gurner2(a,x);
        //gurner3(a,x);

    }
    private static void fill(int[] a) {
        for (int i = 0;  i<a.length; i++) {
            a[i] = (int)(Math.random() * 100);
        }
    }

    private static void handmadeFill(int[] a) {
        int[] ha = {4,3,5,2};
        for (int i = 0;  i<a.length; i++) {
            a[i] = ha[i];
        }
    }


    private static void gurner(int[] a, double x){
        int n = a.length - 1, k = 0;
        double y = (double) a[n];
        double dy = 0; //this is the derevative
        //invariant: 0 <= k <= n,
        // y = a[n]*(x in degree k)+...+a(n-1)*(x in degree k-1)+...+
        //     + a(n-k]*(x in degree 0)
        while ( k != n) {
            k++;
            dy = dy*x + y;
            y = y*x + a[n-k];
        }
        System.out.println("Value in the point f(x) = " + y + " " + x);
        System.out.println("Value in the point f'(x)  = " + dy + " " + x);
    }

    private static void gurner2(int[] a, double x) {
        double p = a[0],q = 0,n = a.length-1;
        for (int i = 1; i <= n; i++) {
            q = x * q + a[i-1]*(n-i+1);
            p = x * p + a[i];
        }

        System.out.println("v2 Value in the point f(x) = " + p + " " + x);
        System.out.println("v2 Value in the point f'(x)  = " + q+ " " + x);
    }

    private static void gurner3(int[] a, double x) {
        double p = a[0], dp = 0, n = a.length-1;
        for (int i = 1; i <= n; i++) {
            dp = x * dp + p;
            p = x * p + a[i];
        }
        System.out.println("v3 Value in the point f(x) = " + p + " " + x);
        System.out.println("v3 Value in the point f'(x)  = " + dp + " " + x);
    }

    private static void revers(int[] x){
        int n = x.length ;
        for (int i = 0; i < n / 2; i++) {
            int tmp = x[i];
            x[i] = x[n-i-1];
            x[n-i-1] = tmp;
        }
    }

    private static void print(int[] a,double x) {
        for (int i = a.length-1;  i>=0; i--) {
            System.out.print(((i!=a.length-1)?"+":"") + a[i] + "*" + x + "^"+ i );
        }
        System.out.println();
    }
}
