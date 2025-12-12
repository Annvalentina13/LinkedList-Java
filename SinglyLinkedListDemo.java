import java.util.Collections;
import java.util.LinkedList;

public class SinglyLinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // 1. CREATE LIST
        System.out.println("Creating list with 1, 2, 3...");
        Collections.addAll(list, 1, 2, 3);
        print(list);

        // 2. INSERT AT BEGINNING
        System.out.println("\nInsert at beginning: 0");
        list.addFirst(0);
        print(list);

        // 3. INSERT AT END
        System.out.println("\nInsert at end: 4");
        list.addLast(4);
        print(list);

        // 4. INSERT AT INDEX
        System.out.println("\nInsert at index 2: 99");
        list.add(2, 99);     // index = 2, value = 99
        print(list);

        // 5. DELETE AT BEGINNING
        System.out.println("\nDelete at beginning");
        list.removeFirst();
        print(list);

        // 6. DELETE AT END
        System.out.println("\nDelete at end");
        list.removeLast();
        print(list);

        // 7. DELETE AT INDEX
        System.out.println("\nDelete at index 1");
        list.remove(1);     // delete value at index 1
        print(list);

        // 8. SEARCH ELEMENT
        System.out.println("\nSearch for element 99:");
        int index = list.indexOf(99);
        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found!");

        // 9. REVERSE LIST
        System.out.println("\nReverse the list:");
        Collections.reverse(list);
        print(list);

        // 10. LENGTH OF LIST
        System.out.println("\nLength of list: " + list.size());

        // 11. MID ELEMENT
        System.out.println("\nMid element:");
        if (!list.isEmpty()) {
            int mid = list.get(list.size() / 2);
            System.out.println("Middle element = " + mid);
        } else {
            System.out.println("List is empty!");
        }
    }

    // PRINT FUNCTION
    static void print(LinkedList<Integer> list) {
        System.out.println("List: " + list);
    }
}
