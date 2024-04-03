public class Ex02 {
    public static int funcao(int n) {
        int p = 1;
        int r = n;
        while (p + 1 < r) {
            int q = (p + r) / 2;
            if (Math.pow(q, 2) <= n) {
                p = q;
            } else {
                r = q;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        System.out.println(funcao(81));
    }
}
