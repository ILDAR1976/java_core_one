package basic_2;

public class Basic_1_2_26 {
    public static void main(String[] args) {
        int[][] a = new int[15][17];
        int[] b = new int[15];

        fill(a);fill(b, 0);
        System.out.println("a = ");print(a);
        find(a, b);

    }
    private static void handmade_fill(int[][] x) {
        int[][] a = {
                {5,17,18,25},
                {1,5,15,16},
                {1,3,4,5}
        };

        for (int i = 0; i<a.length;i++){
            for (int j = 0; j<a[0].length;j++){
                x[i][j] = a[i][j];
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
        int n = b.length,s = 0;
        boolean eq = false;

        while (!eq) {
            for (int i = 1; i < a.length; i++) {
                eq = true;
                boolean out = true;
                for (int j = b[i]; j < a[0].length; j++) {
                    if (a[i][j] >= a[0][b[0]]) {
                        if (a[i][j] > a[0][b[0]]) {
                            int d = j - 1;
                            if (d<0) b[i] = j; else b[i] = d;
                        } else {
                            b[i] = j;
                        }
                        eq&=(a[i][j] == a[0][b[0]]);
                        out = false;
                        break;
                    }
                }
                if (out) {
                    b[0] = 1000;
                    break;
                }
            }
            b[0]++;
        }
        if (b[0]==1001) {
            System.out.println("The number of cross not found");
        } else {
            System.out.println(" x = " + a[0][--b[0]]);
        }

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
