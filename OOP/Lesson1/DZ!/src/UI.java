import java.util.ArrayList;
import java.util.Collections;

public class UI implements IView{  
   
   
    public void getTreeView(StringBuilder tree, Person rootPerson, String indent,
            boolean lastSubPerson, boolean start, boolean reverse) {
        tree.append(indent);
        if (start) {
            start = false;
        } else if (lastSubPerson) {
            tree.append("└─");
            indent += "  ";
        } else {
            tree.append("├─");
            indent += "│ ";
        }
        tree.append(rootPerson.toString() + "\n");

        ArrayList<Person> subPersons = rootPerson.getFamily();
        Collections.sort(subPersons, new PersonNameComparator(reverse));
        
        for (int index = 0; index < subPersons.size(); index++) {
            getTreeView(tree, subPersons.get(index), indent, index == subPersons.size() - 1, start, reverse);
        }

    }

    public void viewRelatives(Person rootPerson, boolean reverse){
        StringBuilder tree = new StringBuilder();
        getTreeView(tree, rootPerson, "", false, true, reverse);
        System.out.println(tree);
    }
}
