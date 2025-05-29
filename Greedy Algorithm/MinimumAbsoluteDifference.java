import java.util.Arrays;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int A[] = { 9, 2, 6, 5, 3, 1 };
        int B[] = { 1, 5, 2, 4, 6, 8 };
        Arrays.sort(A);
        Arrays.sort(B);
        int minDiff = 0;
        for (int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println("Minimum Absolute Difference : " + minDiff);
    }
}
