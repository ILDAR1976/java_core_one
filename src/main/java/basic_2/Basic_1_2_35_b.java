package basic_2;

public class Basic_1_2_35_b {
    public static void main(String[] args) {
        int m = 4;
        int[] a = new int[15];
        a = fill();
        System.out.println("m = "+ m);
        System.out.print("a = ");print(a);
        getMaxs(a,m);
    }
    private static int[] fill() {
        int[] x = {9,8,1,2,6,5};
        return x;
    }
    private static void getMaxs(int[] a, int m) {
        int n = a.length,i = 0;
        int[] r = new int[n];
        int[] l = new int[n];
        while (i < n){
            getMaxInBlock(a,r,l,i,m);
            i += m;
        }
        int max = 0;
        for (int j = 0; j+m-1<n; j++) {
            max = (l[j] >= r[j+m-1])? l[j]:r[j+m-1];
            System.out.print(max + " ");
        }
    }

    private static void getMaxInBlock(int[] a, int[] r, int[] l,int id, int m){
        int n = a.length-1, i = id,j = id+m-1,lmax = 0,rmax = 0;
        if (n<j) j = n;
        while (j >= id) {
            if (a[i]>rmax) rmax = a[i];
            if (a[j]>lmax) lmax = a[j];
            r[i] = rmax;l[j] = lmax;
            i++;j--;
        }
    }

    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
}
