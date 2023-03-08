
public class Main {
    public static void main(String[] args) throws Exception {            

        ITree tree = new GeoTree();       
        IResearch research = new Reserch(tree);
        IView view = new UI();
        IDataSource persons = new DataSource();
        ResearchWork work = new ResearchWork(tree, research, view, persons);
        work.Run();
        
    }

}
