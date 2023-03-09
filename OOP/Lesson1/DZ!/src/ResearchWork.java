import java.util.ArrayList;
import java.util.Collections;

public class ResearchWork {
    
    private ITree tree;
    private IResearch research;
    private IView view;
    private ArrayList<Person> persons;
    private IDataSource source;

    public ResearchWork(ITree tree, IResearch research, IView view, IDataSource source) {
       this.tree = tree;
       this.research = research;
       this.view = view;
       this.source = source;
       this.persons = this.source.loadData();
    }
    
   private void configTree(){
    
    Person p0 = persons.get(0);
    Person p1 = persons.get(1);
    Person p2 = persons.get(2);
    Person p3 = persons.get(3);
    Person p4 = persons.get(4);
    tree.append(p0, p1);
    tree.append(p0, p2);
    tree.append(p1, p3);
    tree.append(p1, p4);
   }
    
    public void Run(){
      
        configTree();
        persons.get(0).setFamily(research.getRelatives(persons.get(0), Relationship.parent));
        persons.get(1).setFamily(research.getRelatives(persons.get(1), Relationship.parent));

        view.viewRelatives(persons.get(1));
        view.viewRelatives(persons.get(0));
        
       // persons.sort((w1, w2) -> Integer.compare(w2.fullName.length(), w1.fullName.length()));
       Collections.sort(persons);
       
        System.out.println(persons.toString());

    }


    
}
