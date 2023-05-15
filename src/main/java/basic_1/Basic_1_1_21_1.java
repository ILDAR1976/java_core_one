package basic_1;

public class Basic_1_1_21_1 {
    public static void main(String[] args) {
        int k = 0;
        int n = 10;
        int k_square = 0;

        //invariant k <= n
        while (!(k == n)) {
            k++;
            // k_square = (k-1) * (k-1) - 2*k + 1
            k_square += k + k - 1;
            System.out.println(k+"*"+k+"="+k_square);
        }
    }
}
