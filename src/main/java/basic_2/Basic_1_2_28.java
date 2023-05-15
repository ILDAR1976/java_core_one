package basic_2;

public class Basic_1_2_28 {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int q = 26;

        System.out.println("q = " + q);
        a = fill();
        System.out.println("x = ");print(a);
        System.out.println(find(a, q)?"found":"not found");

    }
    private static int[][] fill(){
        int[][] r = {
                {2,3,4},
                {3,26,32},
                {10,34,56}
        };
        return r;
    }

    private static boolean find(int[][] x, int q) {
        int n = x.length - 1, m = x[0].length - 1;
        int l = n, k = 0;
        while ((l>0) && (k < m+1) && (x[l][k] != q)){
            if (x[l][k] < q) {
                k++;
            } else {
                l--;
            }
        }
        return  (l>0) && (k < m + 1);
    }
    private static void print(int[][] x) {
        for (int i = 0;  i<x.length; i++) {
            for (int j = 0;  j<x.length; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
