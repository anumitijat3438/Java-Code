import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueuebyJavaCollectionFramework {
    public static void main(String[] args) {
        // By linkedlist
        System.out.println("By Using LinkedList:");
        Queue<Integer> q = new LinkedList<>();
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

        // by ArrayDeque
        Queue<Integer> q1 = new ArrayDeque<>();
        System.out.println("By Using ArrayDeque:");
        q1.add(7);
        q1.add(8);
        q1.add(9);
        q1.add(10);
        while (!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}
