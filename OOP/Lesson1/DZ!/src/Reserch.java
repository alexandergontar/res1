import java.util.ArrayList;

public class Reserch implements IResearch{ 
    private ArrayList<Node> tree;   

    public Reserch(ITree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        ArrayList<String>  result = new ArrayList<String>();
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

    public ArrayList<Person> getRelatives(Person p, Relationship re){
        ArrayList<Person>  result = new ArrayList<Person>();
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {              
                result.add(t.p2);
            }
        }       
       return result;
    }

}
