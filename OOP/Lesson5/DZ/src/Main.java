public class Main {
    public static void main(String[] args) throws Exception {
        Presenter presenter = new Presenter(new View(), new Model());
        presenter.userInterfaceLoop();
    }
}
