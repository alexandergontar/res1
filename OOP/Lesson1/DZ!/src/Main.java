
public class Main {
    public static void main(String[] args) throws Exception {            

        ITree tree = new GeoTree();       
        IResearch research = new Reserch(tree);
        IView view = new UI();
        IDataSource source = new DataSource();
        ResearchWork work = new ResearchWork(tree, research, view, source);
        work.Run();
        
    }

}
