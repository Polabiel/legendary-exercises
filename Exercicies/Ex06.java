public class Ex06 {
    public static int[] funcao(int[] A, int k) {
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i] + A[j] == k) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[0];
    }
}
