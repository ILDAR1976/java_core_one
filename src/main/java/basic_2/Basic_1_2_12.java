package basic_2;

public class Basic_1_2_12 {
    public static void main(String[] args){
        //Gurner scheme
        double x = 5.23;
        int[] a = new int[3];
        fill(a);
        System.out.print("a = ");print(a,x);
        gurner(a,x);
    }
    private static void fill(int[] a) {
        for (int i = 0;  i<a.length; i++) {
            a[i] = (int)(Math.random() * 100);
        }
    }
    private static void gurner(int[] a, double x){
        int n = a.length - 1, k = 0;
        double y = (double) a[n];
        //invariant: 0 <= k <= n,
        // y = a[n]*(x in degree k)+...+a(n-1)*(x in degree k-1)+...+
        //     + a(n-k]*(x in degree 0)
        while ( k != n) {
            k++;
            y = y*x + a[n-k];
        }
        System.out.println("Value in the point "+ x + " = " + y);
    }

    private static void print(int[] a,double x) {
        for (int i = a.length-1;  i>=0; i--) {
            System.out.print(((i!=a.length-1)?"+":"") + a[i] + "*" + x + "^"+ i );
        }
        System.out.println();
    }
}
