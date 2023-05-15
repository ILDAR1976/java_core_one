package basic_2;

public class Basic_1_2_5_2 {
    public static void main(String[] args){
        int n = 10;
        int[] x = new int[n];
        fill(x);
        System.out.print("x = ");print(x);
        diffrents(x);
    }

    private static void fill(int[] x) {
        x[0] = (int)(Math.random() * 100);
        for (int i = 1;  i<x.length; i++) {
            while (x[i]<x[i-1]) {
                x[i] = (int)(Math.random() * 100);
            }
        }
    }
    private static void diffrents(int[] x){
        int n = x.length, k = 1;
        for  (int i = 0; i<n-1;i++) {
            if (x[i] != x[i+1]) k++;
        }
        System.out.println("different: " + k);
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
}
