package basic_2;

public class Basic_1_2_31 {
    public static void main(String[] args) {
        int b = 50;
        int[] a = new int[15];
        fill(a);
        //a=fill();
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
        int n = a.length - 1,l = 0,r = n;
        while (l != r) {
            if (a[l+1] <= b) {
                if(l<=n)l++;
            } else if (a[r] >= b){
                if(r >=1) r--;
            } else {
                swap(a,l+1,r);
                if(r >=1 && l<=n) l++;r--;
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
