import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {            

        ITree tree = new GeoTree();       
        IResearch research = new Reserch(tree);
        IView view = new UI();
        ArrayList<Person> persons = new DataSource().loadData(tree);
        ResearchWork work = new ResearchWork(tree, research, view, persons);
        work.Run();
        
    }

}
