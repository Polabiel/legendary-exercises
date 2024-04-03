import java.util.Random;

public class Ex05 {
    public static int[] embaralhe(int[] A) {
        Random rand = new Random();
        
        for (int i = A.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
        
        return A;
    }
}
