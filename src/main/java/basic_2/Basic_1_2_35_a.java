package basic_2;

public class Basic_1_2_35_a {
    public static void main(String[] args) {
        int m = 4;
        int[] a = new int[15];
        a = fill();
        System.out.println("m = "+ m);
        System.out.print("a = ");print(a);
        getMaxs(a,m);
    }
    private static int[] fill() {
        int[] x = {1,2,3,4,5};
        return x;
    }
    private static void getMaxs(int[] a, int m) {
        int n = a.length;
        for (int i = 0; i+m<=n; i++) {
            getMaxInBlock(a,m,i);
        }
    }

    private static void getMaxInBlock(int[] a, int m, int id){
        int max = 0;
        for (int i = id; i<id+m; i++) {
            if (a[i]>max) max = a[i];
        }
        System.out.print(max + " ");
    }

    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
}
