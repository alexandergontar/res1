
public class App {
    public static void printList(LinkNode head) {
        LinkNode pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data + " -> ");
            pointer = pointer.next;
        }
        System.out.println("null");
    }

    public static LinkNode push(LinkNode head, int data) {
        LinkNode node = new LinkNode(data);
        node.next = head;
        return node;
    }

    public static LinkNode reverse(LinkNode head, LinkNode firstNode) {
        LinkNode first, rest;
        if (head == null) {
            return firstNode;
        }
        first = head;
        rest = first.next;
        if (rest == null) {
            firstNode = first;
            return firstNode;
        }
        firstNode = reverse(rest, firstNode);
        rest.next = first;
        first.next = null;

        return firstNode;
    }

    public static LinkNode reverse(LinkNode head) {
        return reverse(head, head);
    }

    // ================================================================
    public static void reverseLinkedList(MyLinkedList linkedList) {
        Node previous = null;
        Node current = linkedList.head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        linkedList.head = previous;
    }

    public static void printLinkedList(MyLinkedList linkedList) {
        Node temp = linkedList.head;
        while (linkedList.head != null) {
            System.out.print(linkedList.head.data + " ");
            linkedList.head = linkedList.head.next;
        }
        System.out.println();
        linkedList.head = temp;
    }

    public static Node recursiveReverse(Node head) {
        Node first;

        if (head == null || head.next == null){
            return head;
        } 

        first = recursiveReverse(head.next);
        head.next.next = head;
        head.next = null;
        return first;
    }

    public static void main(String[] args) throws Exception {
        int[] keys = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        LinkNode head = null;
        for (int i = keys.length - 1; i >= 0; i--) {
            head = push(head, keys[i]);
        }
        printList(head);
        head = reverse(head);
        printList(head);
        // ===========================================
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.head = new Node(1);
        myLinkedList.head.next = new Node(2);
        myLinkedList.head.next.next = new Node(3);

        printLinkedList(myLinkedList);
        reverseLinkedList(myLinkedList);
        printLinkedList(myLinkedList);
        myLinkedList.head = recursiveReverse(myLinkedList.head);
        printLinkedList(myLinkedList);
    }
}
