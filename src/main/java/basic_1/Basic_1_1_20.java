package basic_1;

public class Basic_1_1_20 {
    public static void main(String[] args) {
        int k = 0;
        int n = 10;

        //invariant k <= n
        while (!(k == n)) {
            k++;
            System.out.println(k*k);
        }
    }
}
