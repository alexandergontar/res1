import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Person irina = new Person("Ирина");
        Person vasya = new Person("Вася");
        Person masha = new Person("Маша");
        Person jane = new Person("Женя");
        Person ivan = new Person("Ваня");
        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);       
        irina.setFamily(new Reserch(gt).getRelatives(irina,Relationship.parent));
        vasya.setFamily(new Reserch(gt).getRelatives(vasya,Relationship.parent));
       
       // System.out.println(irina.getFamily());
        StringBuilder tree = new StringBuilder();
        getTreeView(tree, irina, "", false);
        System.out.println(tree);
    }
    static void getTreeView(StringBuilder tree, Person rootPerson, String indent,
     boolean lastSubPerson){
      // System.out.println(rootPerson);
       
       /*for (Person person : rootPerson.getFamily()) {
          view(person);
       }*/
      // tree.append(rootPerson.toString() + "\n");
       tree.append(indent);
       if (lastSubPerson)
       {
           tree.append("└─");
           indent += "  ";
       }
       else
       {
           tree.append("├─");
           indent += "│ ";
       }
       tree.append(rootPerson.toString() + "\n");

       ArrayList<Person> subPersons =rootPerson.getFamily();
       for (int index = 0; index < subPersons.size(); index++) {
        getTreeView(tree, subPersons.get(index), indent, index == subPersons.size()-1);
       }

    }
}
