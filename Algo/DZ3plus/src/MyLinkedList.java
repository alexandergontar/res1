public class MyLinkedList {
    public Node head;
    public Node tail;

    public void printLinkedList(MyLinkedList linkedList) {
        Node temp = linkedList.head;
        while (linkedList.head != null) {
            System.out.print(linkedList.head.value + " ");
            linkedList.head = linkedList.head.next;
        }
        System.out.println();
        linkedList.head = temp;
    }

    public void reverseLinkedList(MyLinkedList linkedList) {
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

    public Node recursiveReverse(Node head) {
        Node first;

        if (head == null || head.next == null) {
            return head;
        }

        first = recursiveReverse(head.next);
        head.next.next = head;
        head.next = null;
        return first;
    }

    public void AddNode(Node startNode, int value) {
        Node node = startNode;
        while (node.next != null) {
            node = node.next;
        }
        Node newNode = new Node(value);
        node.next = newNode;
        // newNode.previous = node; // for 2-way list

    }
    public void push(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public int pop(){
        if (head == null) {
            System.out.println( "Пустой стек");
            throw new IllegalArgumentException("Empty Stack");
        }
        int result = head.value;
        head = head.next;
        return result;
    }

}
