package basic_1;

public class Basic_1_1_22_2 {
    public static void main (String[] args) {
        int n = 532;
        int k = n;
        int l = 2;

        //product of k printed numbers equals n;
        // printed numbers are prime; k has no
        // divisors less than l

        while (!(k == 1)) {
           if (k % l == 0) {
               // k is divisible by l and has
               // no divisors less than l, so l is just
               k /= l;
               System.out.print(l+" ");
           } else {
               // k is not divided by l
               l++;
           }
        }

    }
}
