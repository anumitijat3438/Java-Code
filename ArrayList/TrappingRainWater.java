import java.util.ArrayList;
import java.util.Collections;

public class TrappingRainWater {

    public static int trap(ArrayList<Integer> height) {
        int n = height.size();
        if (n == 0) {
            return 0;
        }
        ArrayList<Integer> leftMax = new ArrayList<>(Collections.nCopies(n, 0));
        ArrayList<Integer> rightMax = new ArrayList<>(Collections.nCopies(n, 0));
        leftMax.set(0, height.get(0));
        for (int i = 1; i < n; i++) {
            leftMax.set(i, Math.max(height.get(i), leftMax.get(i - 1)));
        }
        rightMax.set(n - 1, height.get(n - 1));
        for (int i = n - 2; i >= 0; i--) {
            rightMax.set(i, Math.max(height.get(i), rightMax.get(i + 1)));
        }
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            trappedWater += Math.min(leftMax.get(i), rightMax.get(i)) - height.get(i);
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(0);
        list.add(3);
        list.add(2);
        list.add(5);

        System.out.println(list);
        System.err.println(trap(list));
    }
}
