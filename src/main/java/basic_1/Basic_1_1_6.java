package basic_1;

public class Basic_1_1_6 {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = 0;

        System.out.println(a+" "+b+" "+c);

        while (c != b)  {
            c++;
            a += 1;
        }

        System.out.println(a+" "+b+" "+c);
    }
}
