package basic_1;

public class Basic_1_1_9 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        int n = 16;
        int i = 2;

        // invariant: c = a + b;

        System.out.println(a+" "+n);
        System.out.print(a+","+b);

        while (i < n)  {
            c = a + b;
            a = b;
            b = c;
            i++;
            System.out.print(","+c);
        }



    }
}
