public class App {
    private static Node root = null;
    public static void main(String[] args) throws Exception {
        
        LLRBTREE tree = new LLRBTREE();
     
    root = tree.insert(root, 10);
    // to make sure that root remains
    // black is color
    root.color = false;
     
    root = tree.insert(root, 20);
    root.color = false;
     
    root = tree.insert(root, 30);
    root.color = false;
     
    root = tree.insert(root, 40);
    root.color = false;
     
    root = tree.insert(root, 50);
    root.color = false;
     
    root = tree.insert(root, 25);
    root.color = false;
 
    // display the tree through inorder traversal.
    tree.inorder(root);
    tree.DispTree(root);
 
    }
}
