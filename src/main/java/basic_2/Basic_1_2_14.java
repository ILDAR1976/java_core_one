package basic_2;

public class Basic_1_2_14 {
    public static void main(String[] args) {
        //Gurner scheme
        int m = 3,n = 4;
        double[] x = new double[m];
        int[][] a = new int[m][n];
        fill(a,x);
        //handmadeFill(a,x);
        System.out.print("a = ");print(a, x);
        gurner(a,x);
    }

    private static void fill(int[][] a, double[] x) {
        for (int i = 0;  i<x.length; i++) {
            x[i] = (Math.random() * 10);
        }
        for (int i = 0;  i<a.length; i++) {
            for (int j = 0;  j<a[0].length; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }
    }
    private static void handmadeFill(int[][] a, double[] x) {
        double[] xt = {2,3};
        int[][] at = {
                {2,5,3},
                {3,1,2}
             };
        for (int i = 0;  i<x.length; i++) {
            x[i] = xt[i];
        }
        for (int i = 0;  i<a.length; i++) {
            for (int j = 0;  j<a[0].length; j++) {
                a[i][j] = at[i][j];
            }
        }
    }
    private static void gurner(int[][] sk, double[] sx){
        int m = sk.length;
        int n = sk[0].length;
        double[] x = new double[m];
        double[] a = new double[n];
        double[] y = new double[m];
        double[] dy = new double[m];

        //The preparation stage
        for (int j = 0; j < n; j++){
            a[j] = 1;
            for (int i = 0; i < m; i++){
                a[j] *= sk[i][j];
            }
        }
        for (int i = 0; i < m; i++){
            y[i] = 1;y[i] *= a[n-1]*Math.pow(prepareKoef(sx,i),m);
            dy[i] = 0;
            x[i] = sx[i];
        }

        for (int i = 0; i < m; i++) {
            int j = 0;
            while (j != n-1) {
                j++;
                dy[i] = dy[i] * x[i] + y[i];
                y[i] = y[i] * x[i] + a[n-j-1] * Math.pow(prepareKoef(sx, i), n-j-1);
            }
        }

        for (int i = 0; i < m; i++) {
            System.out.println("The derivative " + (i+1) + " value = " + dy[i]);
        }
    }

    private static double prepareKoef(double[] x, int exclude){
        double result = 1;
        for (int i = 0; i < x.length; i++) {
            result *= (i != exclude)?x[i]:1;
        }
        return result;
    }

    private static void print(int[][] a,double[] x) {
        for (int j = 0;  j<a[0].length; j++) {
            for (int i = 0;  i<a.length; i++) {
                System.out.print((i!=0?"*(":"(") + a[i][j] + "*" + x[i] + "^"+ (a[0].length-j-1)+")");
            }
            System.out.print((j<a[0].length - 1)?" + ":"");
        }
        System.out.println();
    }

}

