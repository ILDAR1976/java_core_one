package basic_1;

public class Basic_1_1_26 {
    public static void main (String[] args) {
        int n = 50865;
        int k = 0;
        int base = 1;
        //base - degree 10, not ascending n
        while (10 * base <= n) {
            base *= 10;
        }
        //base - the maximum degree of 10, not exceeding n
        k = n;
        //invariant: the left to print k with the same number of
        //characters as in base ; base = 100..00
        while ( base != 1) {
            System.out.print((k / base));
            k %= base;
            base /= 10;
        }
        //base=1 ; the one-digit number k is left to print
        System.out.println(k);
    }
}
