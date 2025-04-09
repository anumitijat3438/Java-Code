import java.util.ArrayList;

public class ArraylistOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // to add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // get to access element at aby particular index
        int element1 = list.get(1);
        System.out.println(element1);
        int element2 = list.get(list.size() - 1);
        System.out.println(element2);

        // remove is used to delete element
        list.remove(3);
        System.out.println(list);

        // set is used to replace element
        list.set(2, 7);
        System.out.println(list);

        // contains is used to check whether an element exit in array or not
        System.out.println(list.contains(3));
        System.out.println(list.contains(7));

    }
}
