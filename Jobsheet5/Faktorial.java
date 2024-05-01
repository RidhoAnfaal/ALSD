public class Faktorial {
    public int num;

    public int faktorialkBF(int n) {
        if (n == 0) {
            return 1;
        }
        return n * faktorialkBF(n - 1);
    }

    public int faktorialkDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialkDC(n - 1);
            return fakto;
        }
    }
}
/*
 * public int faktorialkBF(int n) {
 * int fakto = 1;
 * for (int i = 1; i <= n; i++) {
 * fakto = fakto * i;
 * }
 * return fakto;
 * }
 */