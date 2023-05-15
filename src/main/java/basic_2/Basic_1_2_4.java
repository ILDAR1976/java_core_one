package basic_2;

public class Basic_1_2_4 {
    public static void main(String[] args){
        int n = 10;
        int[] x = new int[n];
        int[] y = new int[n];
        fill(x);
        System.out.print("x = ");print(x);
        System.out.print("maximum x = " +  max(x));
    }

    private static void fill(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            x[i] = (int)(Math.random() * 100);
        }
    }
    private static int max(int[] x){
        int i = 0, n = x.length, max = x[0];
        //invariant: max = maximum from x[0] .. x[i]
        while (i != n) {
            // max = maximum from x[0] .. x[i - 1]
            if (x[i] > max) max = x[i];
            i++;
        }
        return max;
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
}
