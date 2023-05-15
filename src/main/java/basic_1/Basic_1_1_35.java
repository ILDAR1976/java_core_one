package basic_1;

public class Basic_1_1_35 {
    public static void main(String[] args) {
        int b = 10, b1 = b, a = 0;
        while (b1 <= a) {
            b1 *= a;
        }
        //b1 > a, b1 = b * (some degree of 2)
        int q = 0, r = a;
        // invariant: q, r - the quotient and the remainder of a divided by b1,
        // b1 = b * (some degree of 2)
        while (b1 != b) {
            b /= 2; q *= 2;
            // a = b1 * q + r, 0 <= r, r < 2 * b1
            if (r >= b1) {
                r -= b1;
                q += 1;
            }
        }
        // q,r -  the quotient and the remainder of a divided by b
        System.out.println("the quotient: " + q);
        System.out.println("the remainder: " + r);
    }
}
