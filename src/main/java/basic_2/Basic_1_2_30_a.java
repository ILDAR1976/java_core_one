package basic_2;

public class Basic_1_2_30_a {
    public static void main(String[] args) {
        int[] a = new int[4];
        a=fill();
        System.out.print("a = ");print(a);
        System.out.println(((isParity(a)==1)?"The permutaion is parity":
                "The permutaion is not parity"));
    }
    private static int[] fill(){
        int[] x = {3,0,1,2};
        return x;
    }

    private static int isParity(int[] a) {
        //Lipskov's algorithm
        int n = a.length-1,s = 1;
        boolean[] na = new boolean[a.length];
        for (int i = 0; i < na.length; i++) na[i] = true;
        for (int i = 0; i < na.length; i++) {
            if (na[i]) {
                int j = a[i];
                while (j != i) {
                    na[j] = false;
                    s = -s;
                    j = a[j];
                }
            }
        }
        return s;
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
}
