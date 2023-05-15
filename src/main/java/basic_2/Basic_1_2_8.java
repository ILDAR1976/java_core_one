package basic_2;

public class Basic_1_2_8 {
    public static void main(String[] args){
        int[] x = new int[10];
        int[] k = new int[90];
        fill(x,k.length-1);
        System.out.print("x = ");print(x);
        System.out.print("differents: " + differents(x,k));
    }

    private static void fill(int[] x, int k) {
        x[0] = (int)(Math.random() * 100);
        for (int i = 0;  i<x.length; i++) {
            do {
                x[i] = (int)(Math.random() * 100);
            } while (x[i]>k);
        }
    }
    private static int differents(int[] x, int[] k){
        int d = 0;

        for (int i = 0; i < x.length; i++) {
            k[x[i]]++;
        }

        for (int i = 0; i < k.length; i++) {
            if (k[i] != 0) d++;
        }

        return d;
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
}
