package basic_2;

public class Basic_1_2_37 {
    public static void main(String[] args) {
        int m = 3;
        int[][] a = fill(5);
        System.out.println("m = "+ m);
        System.out.print("a = ");print(a,a.length,a[0].length);
        System.out.println("The maxs of squares = ");
        getMaxs(a,m);
    }
    private static int[][] fill() {
        int[][] x = {
                {54,	91,	25,	74,	69},
                {7,	76,	72,	0,	65},
                {47,	53,	60,	77,	99},
                {36,	61,	44,	97,	71},
                {60,	99,	2,	49,	12}
        };
        return x;
    }
    private static int[][] fill(int n) {
        int[][] x =  new int[n][n];
        for(int i = 0; i < n;i++) {
            for(int j = 0; j < n;j++) {
                x[i][j] = (int)(Math.random() * 100);
            }
        }
        return x;
    }
    private static void getMaxs(int[][] a, int m) {
        int n = a.length, bi = 0, bj = 0, ei = 0, ej = 0;
        int[][] mr = new int[n][n];
        int[][] ml = new int[n][n];
        for(int i = 0; i <= n-1; i+=m) {
            for(int j = 0; j <= n-1; j+=m) {
                ei = i + m - 1; ej = j + m - 1;
                bi = i; bj = j;
                if (ei>=n) ei = n-1;
                if (ej>=n) ej = n-1;
                getMaxInBlock(a,mr,ml,bi,bj,ei,ej,m);
            }
        }
        int ci = 0,cj = 0,e1 = 0,e2 = 0,max = 0;
        for(int i = 0; i+m <= n; i++) {
            for (int j = 0; j+m <= n; j++) {
                ci = (i+m>n)?n:i+m-1;cj = (j+m>n)?n:j+m-1;
                if (i % m == 0 && j % m == 0) {
                    //one block
                    max = getMaxInColumns(mr,mr,i,j,m);
                } else if (i % m != 0 && j % m == 0) {
                    //two blocks
                    max = getMaxInColumns(ml,mr,i,j,m);
                } else if (i % m == 0 && j % m != 0) {
                    //two blocks
                    max = getMaxInColumns(ml,mr,i,j,m);
                } else if (i % m != 0 && j % m != 0) {
                    //four blocks
                    max = getMaxInColumns(ml,mr,i,j,m);
                }
                System.out.print(max + " ");
            }
            System.out.println();
        }
    }
    private static void getMaxInBlock(int[][] a, int[][] r, int[][] l,int bi, int bj, int ei, int ej, int m){
        int n = a.length, rmax = 0, lmax = 0, ci = ei, cj = ej;

        for(int i = bi; i <= ei;i++) {
            for(int j = bj; j <= ej;j++) {
                if (rmax < a[i][j]) rmax = a[i][j];
                if (lmax < a[ci][cj]) lmax = a[ci][cj];
                r[i][j] = rmax;l[ci][cj] = lmax;cj--;
            }
            cj = ej;ci--;rmax = 0;lmax = 0;
        }
    }
    private static int getMaxInColumns(int[][] a,int[][] b,int bi,int bj,int m){
        int max = 0;
        for(int i = bi;i<bi+m;i++){
            if (max < a[i][bj]) max = a[i][bj];
            if (max < b[i][bj+m-1]) max = b[i][bj+m-1];
        }
        return max;
    }
    private static void print(int[][] x,int n, int m) {
        System.out.println();
        for (int i = 0;  i<n; i++) {
            for (int j = 0;  j<m; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
