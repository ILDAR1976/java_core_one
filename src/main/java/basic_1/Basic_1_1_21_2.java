package basic_1;

public class Basic_1_1_21_2 {
    public static void main(String[] args) {
        int k = 0;
        int n = 10;
        int k_square = 0;

        //invariant k <= n
        while (!(k == n)) {
            k_square += k;
            // k_square = k*k + k
            k++;
            // k_square = (k-1)*(k-1)+(k-1)=k*k-k
            k_square += k;
            System.out.println(k+"*"+k+"="+k_square);
        }
    }
}
