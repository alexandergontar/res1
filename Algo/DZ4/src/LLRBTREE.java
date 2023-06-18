

public class LLRBTREE {
     //private static Node root = null;
     
    // utility function to rotate node anticlockwise.
    Node rotateLeft(Node myNode)
    {
        System.out.printf("left rotation!!\n");
        Node child = myNode.right;
        Node childLeft = child.left;
 
        child.left = myNode;
        myNode.right = childLeft;        
 
        return child;
    }
 
    // utility function to rotate node clockwise.
    Node rotateRight(Node myNode)
    {
        System.out.printf("right rotation\n");
        Node child = myNode.left;
        Node childRight = child.right;
 
        child.right = myNode;
        myNode.left = childRight;
 
        return child;
    }
 
    // utility function to check whether
    // node is red in color or not.
    boolean isRed(Node myNode)
    {
        if (myNode == null)
            return false;
        return (myNode.color == true);
    }
 
    // utility function to swap color of two
    // nodes.
    void swapColors(Node node1, Node node2)
    {
        boolean temp = node1.color;
        node1.color = node2.color;
        node2.color = temp;
    }
 
    // insertion into Left Leaning Red Black Tree.
    Node insert(Node myNode, int data)
    {
        // Normal insertion code for any Binary
        // Search tree.
        if (myNode == null)
            return new Node(data);
 
        if (data < myNode.data)
            myNode.left = insert(myNode.left, data);
         
        else if (data > myNode.data)
            myNode.right = insert(myNode.right, data);
         
        else
            return myNode;
 
 
        // case 1.
        // when right child is Red but left child is
        // Black or doesn't exist.
        if (isRed(myNode.right) && !isRed(myNode.left))
        {
            // left rotate the node to make it into
            // valid structure.
            myNode = rotateLeft(myNode);
 
            // swap the colors as the child node
            // should always be red
            swapColors(myNode, myNode.left);
 
        }
 
        // case 2
        // when left child as well as left grand child in Red
        if (isRed(myNode.left) && isRed(myNode.left.left))
        {
            // right rotate the current node to make
            // it into a valid structure.
            myNode = rotateRight(myNode);
            swapColors(myNode, myNode.right);
        }
 
 
        // case 3
        // when both left and right child are Red in color.
        if (isRed(myNode.left) && isRed(myNode.right))
        {
            // invert the color of node as well
            // it's left and right child.
            myNode.color = !myNode.color;
 
            // change the color to black.
            myNode.left.color = false;
            myNode.right.color = false;
        }
 
        return myNode;
    }
 
 
    // Inorder traversal
    void inorder(Node node)
    {
        if (node != null)
        {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
    int COUNT = 2;
    void PrintTree(Node root, int space)
        {
            // Base case
            if (root == null)
                return;

            // Увеличить расстояние между уровнями
            space += COUNT;

            // Правый сын сверху
            PrintTree(root.right, space);

            // Текущий узел
            // 

            System.out.println();
            for (int i = COUNT; i < space; i++)
                System.out.print(" ");
            System.out.print(root.data + "\n");

            // Левый сын снизу
            PrintTree(root.left, space);
        }

        void DispTree(Node root)
        {
            // Изначальный промежуток 0
            PrintTree(root, 0);
        }
}
