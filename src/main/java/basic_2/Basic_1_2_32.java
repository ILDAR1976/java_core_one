package basic_2;

public class Basic_1_2_32 {
    public static void main(String[] args) {
        int b = 50;
        int[] a = new int[15];
        fill(a);a[3] = 50;a[12] = 50;
        System.out.println("b = "+ b);
        System.out.print("a = ");print(a);
        ranking(a,b);
        System.out.print("a = ");print(a);
    }
    private static void fill(int[] x) {
        for (int i = 1; i < x.length; i++) {
            x[i] = (int) (Math.random() / Math.nextDown(1.0) * 100);
        }
    }
    private static void ranking(int[] a, int b) {
        int n = a.length - 1,l = 0,m = 0,r = n;
        while (m != r) {
            if (a[m+1] == b) {
                if(m<=n)m++;
            } else if (a[m+1] > b){
                swap(a,m+1,r);
                if(r >=1) r--;
            } else {
                swap(a,m+1,l+1);
                if(m<=n && l<=n) l++;m++;
            }
        }
    }
    private static void swap(int[] a, int i, int j) {
        int tmp = 0;
        tmp = a[i];a[i] = a[j];a[j] = tmp;
    }

    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
}
