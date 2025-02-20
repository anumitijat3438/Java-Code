import java.util.*;

public class PerfectNumber {
    public static boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int sum = 1;
        int length = String.valueOf(num).length();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if (checkPerfectNumber(n)) {
            System.out.println(n + " is perfect number");
        } else {
            System.out.println(n + " is not perfect number");
        }
    }
}
