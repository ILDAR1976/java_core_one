package basic_2;

public class Basic_1_2_34 {
    public static void main(String[] args) {
        int m = 3;
        int[] a = new int[15];
        a = fill();
        System.out.println("m = "+ m);
        System.out.print("a = ");print(a);
        getSums(a,m);
    }
    private static int[] fill() {
        int[] x = {5,4,8,3,1};
        return x;
    }
    private static void getSums(int[] a, int m) {
        int n = a.length,s = a[0];
        boolean  flag = false;
        if (m == 1) {
            for (int i = 0; i < n; i++)
                System.out.print(a[i] + " ");
            return;
        }
        for (int i = 1; i < n; i++){
            s += a[i];
            flag = flag || (i % (m-1) == 0);
            if (flag) {
                if ((i-m)>=0) {
                    s -= a[i-m];
                }
                System.out.print(s + " ");
            }
        }
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
}

