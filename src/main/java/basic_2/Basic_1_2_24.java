package basic_2;

public class Basic_1_2_24 {
    public static void main(String[] args) {
        int[] x = new int[15];
        int[] y = new int[15];
        int[] z = new int[15];
        fill(x);fill(y);fill(z);
        System.out.print("x = ");print(x);
        System.out.print("y = ");print(y);
        System.out.print("z = ");print(z);
        int f = find(x,y,z);
        System.out.println((f==(-1))?"The number not found!":"r = " + f);
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
    private static int find(int[] x, int[] y, int[] z) {
        int p = x.length-1,q = y.length-1, r= z.length-1;
        int max = p+q+r;
        int p1=0,q1=0,r1=0,c=0;
        boolean found = false;
        while (c <= max) {
            if ((x[p1] == y[q1]) && (y[q1]==z[r1])) {
                found = true;
                break;
            }
            if (x[p1]<y[q1] && p1 != p){
                p1++;
            } else if (y[q1]<z[r1] && q1 != p) {
                q1++;
            } else if (z[r1]<x[p1] && r1 != r) {
                r1++;
            } else {}
            c++;
        }
        return (found)?x[p1]:-1;
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
}
