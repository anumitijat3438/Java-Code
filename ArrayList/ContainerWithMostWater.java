import java.util.ArrayList;

public class ContainerWithMostWater {
    // Two pointer approach
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int left = 0;
        int right = height.size() - 1;
        while (left < right) {
            int ht = Math.min(height.get(left), height.get(right));
            int width = right - left;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);
            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(3);
        list.add(9);
        list.add(8);
        list.add(1);
        list.add(7);
        System.out.println(list);
        System.out.println(storeWater(list));
    }
}
