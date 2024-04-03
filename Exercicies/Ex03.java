import java.util.Arrays;

public class Ex03 {
    public static int[] ordena(int[] A) {
        int i;
        int j;
        int chave;

        for (i = 1; i < A.length; i++) {
            chave = A[i];
            j = i - 1;
            while (j >= 0 && A[j] > chave) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = chave;
        }
        return A;
    }

    public static void main(String[] args) {
        System.out.println(ordena(new int[] { 0, -1, 5, 18, 37, 22 }));
    }
}
