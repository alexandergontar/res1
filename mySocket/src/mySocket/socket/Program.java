package mySocket.socket;

public class Program {

	public static void main(String[] args) {
		new Thread (new Client("Client")).start();
		new Thread (new Server()).start();		
	}	
}
