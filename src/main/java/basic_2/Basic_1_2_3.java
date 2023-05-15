package basic_2;

public class Basic_1_2_3 {
    public static void main(String[] args){
        int n = 10;
        int[] x = new int[n];
        int[] y = new int[n];
        fill(x);
        System.out.print("before x = ");print(x);
        System.out.print("before y = ");print(y);
        let(y,x);
        System.out.println("- - -");
        System.out.print("after x = ");print(x);
        System.out.print("after y = ");print(y);
    }

    private static void fill(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            x[i] = (int)(Math.random() * 100);
        }
    }
    private static void let(int[] x, int[] y){
        int i = 0, n = x.length;
        //invariant: value of y has not changed , x[l] = y[l] at l<=i
        while (i != n) {
            x[i] = y[i];
            i++;
        }
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
}
