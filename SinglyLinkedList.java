class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // 1. Create list from array
    public void create(int[] arr) {
        head = null;
        for (int x : arr) {
            insertAtEnd(x);
        }
    }

    // 2. Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // 3. Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // 4. Insert at given index (0-based)
    public void insertAtIndex(int index, int data) {
        if (index < 0 || index > length()) {
            System.out.println("Invalid index!");
            return;
        }

        if (index == 0) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 5. Delete at beginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
    }

    // 6. Delete at end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.next == null) { // only 1 node
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // 7. Delete at given index
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= length()) {
            System.out.println("Invalid index!");
            return;
        }

        if (index == 0) {
            deleteAtBeginning();
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    // 8. Search element
    public void search(int key) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Element " + key + " found at index " + index);
                return;
            }
            temp = temp.next;
            index++;
        }

        System.out.println("Element not found!");
    }

    // 9. Reverse list
    public void reverse() {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        head = prev;
    }

    // 10. Length of list
    public int length() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // 11. Return mid element 
    public int midElement() {
        if (head == null) {
            System.out.println("List is empty!");
            return -1;
        }

        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    // 12. Print list
    public void printList() {
        Node temp = head;

        if (temp == null) {
            System.out.println("List is empty!");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        System.out.println("Creating list {1,2,3}");
        list.create(new int[]{1, 2, 3});
        list.printList();

        System.out.println("\nInsert at beginning: 0");
        list.insertAtBeginning(0);
        list.printList();

        System.out.println("\nInsert at end: 4");
        list.insertAtEnd(4);
        list.printList();

        System.out.println("\nInsert at index 2: 99");
        list.insertAtIndex(2, 99);
        list.printList();

        System.out.println("\nDelete at beginning");
        list.deleteAtBeginning();
        list.printList();

        System.out.println("\nDelete at end");
        list.deleteAtEnd();
        list.printList();

        System.out.println("\nDelete at index 1");
        list.deleteAtIndex(1);
        list.printList();

        System.out.println("\nSearch for element 99:");
        list.search(99);

        System.out.println("\nReverse the list:");
        list.reverse();
        list.printList();

        System.out.println("\nLength of list: " + list.length());

        System.out.println("\nMid element: " + list.midElement());
    }
}
