import java.util.ArrayList;

public interface ITree {
    ArrayList<Node> tree = new ArrayList<>();
    public void append(Person parent, Person children);
    public ArrayList<Node> getTree();
}
