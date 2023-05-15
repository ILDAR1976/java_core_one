package basic_1;

public class Basic_1_1_7 {
    public static void main(String[] args) {
        int a = 15;
        int d = 2;
        int q = 0;
        int r = a;

        // invariant: a = q * a + r, 0 <= r

        System.out.println(a+" "+d+" "+q+" "+r);

        while (!(r < d))  {
            r -= d;
            q++;
        }

        System.out.println(a+" "+d+" "+q+" "+r);

    }
}

