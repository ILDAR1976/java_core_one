package basic_1;
import java.util.function.*;
public class Basic_1_1_19 {
    public static void main(String[] args) {
        int a = 126;
        int b = 21;
        int m = a;
        int n = b;
        int d = 1;
        int i = 0;
        int p = 1;
        int r = 0;
        int q = 0;
        int s = 1;
        int x = 0;
        int y = 0;

        Result divH = (in1,in2,param) -> {return (in1 % 2 == 0 && in2 % 2 == 0)?in1/2:(in1+param)/2;};
        Result divL = (in1,in2,param) -> {return (in1 % 2 == 0 && in2 % 2 == 0)?in1/2:(in1-param)/2;};

        System.out.println(a+" "+b+" "+m+" "+n+" "+d);

        while (!((m==0) || (n==0))) {
            if (m % 2 == 0 && n % 2 ==  0) {
                int vp = p; int vq = q;
                int vr = r; int vs = s;
                p = divH.execute(vp,vq,b);
                q = divL.execute(vq,vp,a);

                r = divH.execute(vr,vs,b);
                s = divL.execute(vs,vr,a);
                d *= 2; m /= 2; n /=2;
                System.out.print("a-");


            } else if (m % 2 == 0 && n % 2 == 1)  {
                int vp = p; int vq = q;
                p = divH.execute(vp,vq,b);
                q = divL.execute(vq,vp,a);
                m /= 2;
                System.out.print("b-");
            } else if (m % 2 == 1 && n % 2 == 0)  {
                int vr = r; int vs = s;
                r = divH.execute(vr,vs,b);
                s = divL.execute(vs,vr,a);
                n /= 2;
                System.out.print("c-");
            } else if (m % 2 == 1 && n % 2 == 1 && m >= n)  {
                m -= n; p -= r; q -= s;
                System.out.print("d-");
            } else if (m % 2 == 1 && n % 2 == 1 && n >= m)  {
                n -= m; r -= p; s -= q;
                System.out.print("e-");
            }

            System.out.println((++i)+". "+m+" "+n+"  --> "+(p*a+q*b)+" "+(r*a+s*b)+" "+p+" "+q+" "+r+" "+s);
        }
        if (m==0) {
            x = r; y = s;
        } else {
            x = p; y = q;
        }
        System.out.println(a+" "+b+" "+x+" "+y+" "+m+" "+n+" "+d);
        System.out.println();
        System.out.println("Problem answer: " + ((m==0)?d*n:d*m)+" "+(a*x+b*y));
    }
    interface Result {
       public int execute(int in1,int in2, int param);
    }
}
