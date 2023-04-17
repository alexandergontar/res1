
public class App {	

    public static void main(String[] args) throws Exception {        
        Client client = new Client();
        new Thread (client).start();	
        for(int i = 0; i < 5; i++){
			try{Thread.sleep(5000);}catch(Exception e){}
			System.out.println("Main Thread!");
		}
		//client.setFlag(true);
		client.stop.set(true);
       /* Presenter presenter = new Presenter();
        presenter.setMesengers(new FixedPhone(), new MobilePhone(), new SmartPhone());
        presenter.setViewers(new TextView());
        presenter.run();*/ 
        
    }
}
