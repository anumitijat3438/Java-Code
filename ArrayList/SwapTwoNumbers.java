import java.util.ArrayList;
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void swapTwoNumbers(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

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
        swapTwoNumbers(list, 2, 4);
        System.out.println(list);
    }
}
