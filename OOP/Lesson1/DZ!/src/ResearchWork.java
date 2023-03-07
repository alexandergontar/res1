import java.util.ArrayList;

public class ResearchWork {
    
    private ITree tree;
    private IResearch research;
    private IView view;
    private ArrayList<Person> persons;

    public ResearchWork(ITree tree, IResearch research, IView view, ArrayList<Person> persons) {
       this.tree = tree;
       this.research = research;
       this.view = view;
       this.persons = persons; 
    }
    

    
    public void Run(){
        Person p0 = persons.get(0);//new Person("Ирина");
        Person p1 = persons.get(1);//new Person("Вася");
        Person p2 = persons.get(2);//new Person("Маша");
        Person p3 = persons.get(3);//new Person("Женя");
        Person p4 = persons.get(4);//new Person("Ваня");
        tree.append(p0, p1);
        tree.append(p0, p2);
        tree.append(p1, p3);
        tree.append(p1, p4);
        
        persons.get(0).setFamily(research.getRelatives(persons.get(0), Relationship.parent));
        persons.get(1).setFamily(research.getRelatives(persons.get(1), Relationship.parent));

        view.viewRelatives(persons.get(1));
        view.viewRelatives(persons.get(0));


    }


    
}
