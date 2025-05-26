import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

// when activities are not soeted

public class ActivitySelection2 {
    public static void main(String[] args) {

        int start[] = { 0, 1, 3, 5, 5, 8 };
        int end[] = { 6, 2, 4, 7, 9, 9 };

        // sorting
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastend = activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] > lastend) {
                maxAct++;
                ans.add(activities[i][0]);
                lastend = activities[i][2];
            }
        }
        System.out.println("maximum activities:" + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(" A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
