import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class SortArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element to enter:");
        int n = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println(list);

        // Ascending order
        Collections.sort(list);
        System.out.println(list);

        // Descending Order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
