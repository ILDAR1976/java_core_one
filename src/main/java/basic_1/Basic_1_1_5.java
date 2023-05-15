package basic_1;

public class Basic_1_1_5 {
    public static void main(String[] args) {
        int a = 2;
        int k = 0;
        int b = 1;
        int c = 0;

        System.out.println(a+" "+k+" "+b+" "+c);

        while (k != b)  {
            k++;
            c += a;
        }

        System.out.println(a+" "+k+" "+b+" "+c);
    }
}
