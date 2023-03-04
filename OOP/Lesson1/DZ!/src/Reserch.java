import java.util.ArrayList;

public class Reserch {
   // private ArrayList<String> result = new ArrayList<>();
   // private ArrayList result;
    //private ArrayList res;
    private ArrayList<Node> tree;
   // private ArrayList<Person> relatives = new ArrayList<>();

    public Reserch(GeoTree geoTree) {
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
               // relatives.add(t.p2);
                result.add(t.p2);
            }
        }
       //return relatives;
       return result;
    }

}
