package basic_1;

public class Basic_1_1_18 {
    public static void main(String[] args) {
        int a = 126;
        int b = 112;
        int m = a;
        int n = b;
        int d = 1;

        int i = 0;

        System.out.println(a+" "+b+" "+m+" "+n+" "+d);

        while (!((m==0) || (n==0))) {
            if (m % 2 == 0 && n % 2 ==  0) {
                System.out.println("!");
                d *= 2; m /= 2; n /=2;
            } else if (m % 2 == 0 && n % 2 == 1)  {
                m /= 2;
            } else if (m % 2 == 1 && n % 2 == 0)  {
                n /= 2;
            } else if (m % 2 == 1 && n % 2 == 1 && m >= n)  {
                m -=n ;
            } else if (m % 2 == 1 && n % 2 == 1 && n >= m)  {
                n -=m ;
            }

            System.out.println((++i)+". "+m+" "+n+" "+d);
        }

        System.out.println(a+" "+b+" "+m+" "+n+" "+d);
        System.out.println();
        System.out.println("Problem answer: " + ((m==0)?d*n:d*m));
    }

}
