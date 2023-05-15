package basic_2;

public class Basic_1_2_23 {
    public static void main(String[] args) {
        int[] x = new int[15];
        int[] y = new int[15];
        int[] z = new int[15];
        fill(x);fill(y);fill(z);
        System.out.print("x = ");print(x);
        System.out.print("y = ");print(y);
        System.out.print("z = ");print(z);

        System.out.println("r = " + find(x,y,z));
    }
    private static void fill(int[] x) {
        int q = 7;
        while (isNoContainNumber(x,q)) {
            x[0] = (int) (Math.random() / Math.nextDown(1.0) * 10);
            for (int i = 1; i < x.length; i++) {
                while (x[i] < x[i - 1]) {
                    x[i] = (int) (Math.random() * 100);
                    if (x[i] > q + x[i - 1]) {
                        x[i] = q;
                        continue;
                    }
                }
            }
            if (isZero(x)) x[0] = q;
        }
    }
    private static int find(int[] x, int[] y, int[] z) {
        int p1=0,q1=0,r1=0;
        while (!(x[p1] == y[q1] && (y[q1]==z[r1]))) {
            if (x[p1]<y[q1]){
              p1++;
            } else if (y[q1]<z[r1]) {
              q1++;
            } else if (z[r1]<x[p1]) {
              r1++;
            } else {}
        }
        return x[p1];
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }

    private static boolean isZero(int[] x) {
        int z = 0;
        for (int i = 0;  i<x.length; i++) {
            z += x[i];
        }
        return (z == 0)? true:false;
    }

    private static boolean isNoContainNumber(int[] x,int q) {
        boolean c = true;
        for (int i = 0;  i<x.length; i++) {
            if (x[i] == q) {
                c = false;
                break;
            }
        }
        return c;
    }
}

