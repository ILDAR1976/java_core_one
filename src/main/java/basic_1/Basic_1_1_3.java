package basic_1;

public class Basic_1_1_3 {
    public static void main(String[] args) {
        int a = 2;
        int n = 5;
        int k = 0;
        double b = 1;

        System.out.println(a+" "+n+" "+k+" "+b);

        while (k != n)  {
            k++;
            b*=a;
        }

        System.out.println(a+" "+n+" "+k+" "+b);
    }
}
