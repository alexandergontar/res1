public class Main {
    public static void main(String[] args) throws Exception {
         new Presenter(
            new View(), 
              new Model())
               .mainLoop();        
    }
}
