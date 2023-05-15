package basic_2;

public class Basic_1_2_6 {
    public static void main(String[] args){
        int n = 10;
        int[] x = new int[n];
        fill(x);
        System.out.print("x = ");print(x);
        diffrents(x);
    }
    private static void fill(int[] x) {
        for (int i = 0;  i<x.length; i++) {
                x[i] = (int)(Math.random() * 100);
        }
    }
    private static void diffrents(int[] x){
        int n = x.length, k = 0;
        for  (int i = 0; i<n;i++) {
            if (x[i] == -1) continue;
            int b = x[i];
            for (int j = 0; j<n;j++) {
                if (b == x[j] && x[j] != -1) {
                    x[j] = -1;
                }
            }
            k++;
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
