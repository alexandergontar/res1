public class Node {
    public Node next;
    public Node previous;
    int value;

    Node(int value) {
        this.value = value;
        next = null;
    }
}
