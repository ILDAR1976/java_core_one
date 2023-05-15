package basic_1;

public class Basic_1_1_4 {
    public static void main(String[] args) {
        int a = 2;
        int n = 5;
        int k = n;
        int b = 1;
        int c = a;

        System.out.println(a+" "+n+" "+k+" "+b+" "+c);

        while (k != 0)  {
            if (k % 2 == 0) {
                k /= 2;
                c *= c;
            } else {
                k -= 1;
                b *= c;
            }
        }

        System.out.println(a+" "+n+" "+k+" "+b+" "+c);
    }
}
