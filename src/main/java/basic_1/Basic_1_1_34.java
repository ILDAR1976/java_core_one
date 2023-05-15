package basic_1;

public class Basic_1_1_34 {
    public static void main(String[] args) {
        System.out.println(culculate(10));
    }
    private static int culculate(int n) {
        int k = n,r = 0, l = 0;
        switch (n) {
            case 0: return 13;
            case 1: return 17;
            case 2: return 20;
            case 3: return 30;
        }

        while (k != 0) {
            if (k % 2 == 0) {
                l = k / 2;
                if (k >= 4) {
                    r = 43* culculate(l) + 57* culculate(l+1);
                    return r;
                }
                k = l;
            } else {
                l = k / 2;
                if (k >= 4) {
                    r = 91* culculate(l) + 179* culculate(l+1);
                    return r;
                }
                k = l;
            }
        }
        return r;
    }
}
