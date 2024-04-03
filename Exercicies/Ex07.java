public class Ex07 {
    public static int[] funcao(int[] A) {
        int[] B = new int[A.length];
        int j = 0;
        for (int i = 0; i < A.length; i++) {
            boolean repetido = false;
            for (int k = 0; k < j; k++) {
                if (A[i] == B[k]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                B[j] = A[i];
                j++;
            }
        }
        return B;
    }
}
