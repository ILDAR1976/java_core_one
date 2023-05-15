package basic_1;

public class Basic_1_1_22_1 {

    public static void main (String[] args) {
        int n = 32;
        int k = n;
        int l = 0;

        // invariant: the product of printed numbers and k is n,
        // only prime numbers are printed

        while (!(k == 1)) {
            l = 2;

            while (k % l != 0) {
                l++;
            }
            //l is the smallest divisor of k greater than 1, hence, simple

            System.out.print(l+" ");

            k /= l;
        }

    }

}
