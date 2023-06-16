

public class App {
   
      
    public static void main(String[] args) throws Exception {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.head = new Node(1);
        myLinkedList.head.next = new Node(2);
        myLinkedList.head.next.next = new Node(3);
        

        myLinkedList.printLinkedList(myLinkedList);
        myLinkedList.reverseLinkedList(myLinkedList);
        myLinkedList.printLinkedList(myLinkedList);
        myLinkedList.head = myLinkedList.recursiveReverse(myLinkedList.head);
        myLinkedList.printLinkedList(myLinkedList);

        Node head = myLinkedList.head;
        myLinkedList.AddNode(head, 4);
        myLinkedList.AddNode(head, 5);

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
       for (Node i : myLinkedList ){
        System.out.println(i.value);
       }
    }
}
