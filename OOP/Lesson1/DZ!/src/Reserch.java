import java.util.ArrayList;

public class Reserch {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;
    ArrayList<Person> relatives = new ArrayList<>();

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

    public ArrayList<Person> getRelatives(Person p, Relationship re){
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                relatives.add(t.p2);
            }
        }
       return relatives;
    }

}
