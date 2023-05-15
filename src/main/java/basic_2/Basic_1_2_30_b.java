package basic_2;

public class Basic_1_2_30_b {
    public static void main(String[] args) {
        int[] a = new int[4];
        a=fill();
        System.out.print("befor a = ");print(a);
        inversion(a);
        System.out.print("after a = ");print(a);
    }
    private static int[] fill(){
        int[] x = {1,2,3,0};
        return x;
    }

    private static void inversion(int[] a) {
        int n = a.length,i = 0,j = a[i],c = j,k = 0;
        while (k != n) {
            c = a[j];a[j] = i;
            i = j;j = c;
            k++;
        }
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
}
