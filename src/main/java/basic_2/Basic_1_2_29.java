package basic_2;

public class Basic_1_2_29 {
    public static void main(String[] args) {
        int[] a = new int[150];
        fill(a);
        //a=fill();
        System.out.print("a = ");print(a);
        int number = find(a);
        System.out.println("The number found "  + number);
    }
    private static int[] fill(){
        int[] x = {1,8,15,22,29,36,43,50,50,57,64,64,64,64,71};
        return x;
    }

    private static void fill(int[] x) {
        int q = 7;
        x[0] = (int) (Math.random() / Math.nextDown(1.0) * 10);
        for (int i = 1; i < x.length; i++) {
            x[i] = (int) (Math.random() * 1000);
            while (x[i] > q + x[i - 1] ) {
                x[i] -= 1;
            }
            while (x[i] < x[i - 1] ) {
                x[i] += 1;
            }
        }
    }
    private static int find(int[] a) {
        int n = a.length-1,k = 0, N = a[0];
        while ((k != n) && (a[k+1] <= N+1)) {
            N += a[k+1];
            k++;
        }
        return (N+1);
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
}
