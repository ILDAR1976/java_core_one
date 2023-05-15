package basic_1;

public class Basic_1_1_8 {
    public static void main(String[] args) {
        int n = 7;
        int r = 1;

        // invariant: r *= n, 0 < r

        System.out.println(n+" "+r);

        while (n > 0)  {
            r *= n;
            n--;
        }

        System.out.println(n+" "+r);

    }
}
