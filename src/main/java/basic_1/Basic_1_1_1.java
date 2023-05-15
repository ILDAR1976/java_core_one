package basic_1;

public class Basic_1_1_1{
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int t = 0;

        System.out.println(a+" "+b+" "+t);

        t = a;
        a = b;
        b = t;

        System.out.println(a+" "+b+" "+t);
    }
}
