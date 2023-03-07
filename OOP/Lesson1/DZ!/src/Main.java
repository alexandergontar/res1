public class Main {
    public static void main(String[] args) throws Exception {            

        ITree tree = new GeoTree();       
        IResearch research = new Reserch(tree);
        IView view = new UI();
        ResearchWork work = new ResearchWork(tree, research, view);
        work.Run();
        
    }

}
