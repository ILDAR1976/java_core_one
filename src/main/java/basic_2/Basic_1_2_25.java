package basic_2;

public class Basic_1_2_25 {
    public static void main(String[] args) {
        int[][] a = new int[30][30];
        int[] b = new int[30];

        fill(a);fill(b, 0);
        System.out.println("a = ");print(a);
        find(a, b);

    }
    private static void handmade_fill(int[][] x) {
        int[][] a = {
                {15,16,29},
                {0,15,19},
                {1,15,25}
        };

        for (int i = 0; i<a.length;i++){
            for (int j = 0; j<a[0].length;j++){
                x[i][j] = a[i][j];
            }
        }
    }
    private static void fill(int[] x) {
        int q = 7;
        x[0] = (int) (Math.random() / Math.nextDown(1.0) * 10);
        for (int i = 1; i < x.length; i++) {
            while (x[i] < x[i - 1]) {
                x[i] = (int) (Math.random() * 100);
                if (x[i] > q + x[i - 1]) {
                    x[i] = 0;
                    continue;
                }
            }
        }
    }
    private static void fill(int[] x,int v) {
        for (int i = 0; i < x.length; i++) {
            x[i] = v;
        }
    }
    private static void fill(int[][] x) {
        int q = 7;int number = (int) (Math.random() / Math.nextDown(1.0) * 10 + 1);
        for (int i = 0; i < x.length; i++) {
            x[i][0] =  (int) (Math.random() / Math.nextDown(1.0) * 10);
            boolean contain = false;
            while (!(contain)) {
                for (int j = 1; j < x[0].length; j++) {
                    while (x[i][j] < x[i][j - 1]) {
                        x[i][j] = (int) (Math.random() * 1000);
                        if (x[i][j] > q + x[i][j - 1]) {
                            x[i][j] = number;
                            continue;
                        }
                    }
                    if (x[i][j] == number) contain = true;
                }
                if (x[i][0] == number) contain = true;
                if (!contain) x[i][0] = number;
            }
        }
    }
    private static void find(int[][] a, int[] b) {
        int n = b.length;
        boolean eq = true;
        for (int k = 1; k<n;k++) {
            eq = eq && (a[0][b[0]] == a[k][b[k]]);
        }
        while (!eq) {
            int s = 0, k = 0;
            while (k != (n-1)) {
                k++;
                if (a[k][b[k]] < a[s][b[s]]) {
                    s = k;
                }
            }
            b[s]++;eq = true;
            for (int k1 = 1; k1<n;k1++) {
                eq = eq && (a[0][b[0]] == a[k1][b[k1]]);
            }
        }
        System.out.println(" x = " + a[0][b[0]]);
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
    private static void print(int[][] x) {
        for (int i = 0;  i<x.length; i++) {
            for (int j = 0;  j<x[0].length; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
