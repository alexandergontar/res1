

public class App {
   
      
    public static void main(String[] args) throws Exception {
       // create linked list
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.head = new Node(1);
        myLinkedList.head.next = new Node(2);
        myLinkedList.head.next.next = new Node(3);
        
       // print, reverse, reverse recurively, print
        myLinkedList.printLinkedList(myLinkedList);
        myLinkedList.reverseLinkedList(myLinkedList);
        myLinkedList.printLinkedList(myLinkedList);
        myLinkedList.head = myLinkedList.recursiveReverse(myLinkedList.head);
        myLinkedList.printLinkedList(myLinkedList);
        // add more nodes
        Node head = myLinkedList.head;
        myLinkedList.AddNode(head, 4);
        myLinkedList.AddNode(head, 5);
       // print, reverse, print
       myLinkedList.printLinkedList(myLinkedList);
       myLinkedList.reverseLinkedList(myLinkedList);
       myLinkedList.printLinkedList(myLinkedList);
      //==== stack operations
       myLinkedList.push(6);
       myLinkedList.push(7);
       myLinkedList.push(8);
       myLinkedList.printLinkedList(myLinkedList);
       System.out.println(myLinkedList.pop());
       System.out.println(myLinkedList.pop());
       System.out.println(myLinkedList.pop());
       myLinkedList.printLinkedList(myLinkedList);
       // foreach uses implemented iterable/iterator
       for (Node node : myLinkedList ){
        System.out.println(node.value);
       }
    }
}
