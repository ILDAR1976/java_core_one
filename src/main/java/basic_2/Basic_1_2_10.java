package basic_2;

public class Basic_1_2_10 {
    public static void main(String[] args){
        int[] x = new int[10];
        fill(x);
        System.out.print("x = ");print(x);
        revers(x);
        System.out.print("x = ");print(x);
    }

    private static void fill(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            x[i] = (int)(Math.random() * 100);
        }
    }
    private static void revers(int[] x){
        int n = x.length ;
        for (int i = 0; i < n / 2; i++) {
            int tmp = x[i];
            x[i] = x[n-i-1];
            x[n-i-1] = tmp;
        }
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
}
