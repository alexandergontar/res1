public class App {
    public static void main(String[] args) throws Exception {        
        Presenter presenter = new Presenter();
        presenter.setMesengers(new FixedPhone(), new MobilePhone(), new SmartPhone());
        presenter.setViewers(new TextView());
        presenter.run();
        
    }
}
