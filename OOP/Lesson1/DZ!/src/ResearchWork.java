public class ResearchWork {
    
    private ITree tree;
    private IResearch research;
    private IView view;

    public ResearchWork(ITree tree, IResearch research, IView view) {
       this.tree = tree;
       this.research = research;
       this.view = view; 
    }

    public void Run(){
        Person irina = new Person("Ирина");
        Person vasya = new Person("Вася");
        Person masha = new Person("Маша");
        Person jane = new Person("Женя");
        Person ivan = new Person("Ваня");
        tree.append(irina, vasya);
        tree.append(irina, masha);
        tree.append(vasya, jane);
        tree.append(vasya, ivan);
        
        irina.setFamily(research.getRelatives(irina, Relationship.parent));
        vasya.setFamily(research.getRelatives(vasya, Relationship.parent));

        view.viewRelatives(vasya);
        view.viewRelatives(irina);


    }


    
}
