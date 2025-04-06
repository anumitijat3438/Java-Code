import java.util.*;

public class SimpleArrayList {
    public static void main(String[] args) {
        int sum = 0;
        float avg = 0;
        ArrayList<Integer> l = new ArrayList<>();
        System.out.println("enter the Input:");
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            l.add(input.nextInt());
        }
        for (int i = 0; i < l.size(); i++) {
            sum = sum + l.get(i);
        }
        System.out.println("Sum is :" + sum);
        avg = sum / l.size();
        System.out.println("Average is:" + avg);
    }
}
