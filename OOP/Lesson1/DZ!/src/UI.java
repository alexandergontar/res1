import java.util.ArrayList;
import java.util.Collections;

public class UI implements IView{  
   
   
    public void getTreeView(StringBuilder tree, Person rootPerson, String indent,
            boolean lastSubPerson, boolean start) {
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
        Collections.sort(subPersons, new PersonNameComparator(true));
        
        for (int index = 0; index < subPersons.size(); index++) {
            getTreeView(tree, subPersons.get(index), indent, index == subPersons.size() - 1, start);
        }

    }

    public void viewRelatives(Person rootPerson){
        StringBuilder tree = new StringBuilder();
        getTreeView(tree, rootPerson, "", false, true);
        System.out.println(tree);
    }
}
