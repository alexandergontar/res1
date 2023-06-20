public class App {
    private static Node root = null;
    public static void main(String[] args) throws Exception {
        
        LLRBTREE tree = new LLRBTREE();
     
    root = tree.insert(root, 10);
      // корневой элемент черный
    
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
 
    // центрированный обход и распечатка    
    tree.inorder(root);
    tree.DispTree(root); 
    }
}
