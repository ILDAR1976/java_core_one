package basic_1;

public class Basic_1_1_30 {
    public static void main(String[] args) {
        double n = 95, l = 0,  k = 15;
        double r = 1;
        // invariant : printed l digits of 1/n ,
        // left to print k - l bits of fraction r/n
        while (l!=k) {
            System.out.print((int)(10 * (int)r) / (int)n);
            r = (10 * r) % n;
            l += 1;
        }
    }
}
