package basic_1;

public class Basic_1_1_2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println(a+" "+b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a+" "+b);
    }
}
