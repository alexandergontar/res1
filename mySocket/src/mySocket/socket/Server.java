package mySocket.socket;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class Server implements Runnable{
	private static ServerSocket server;
	private  static Socket connection;
	private static ObjectOutputStream output;
	private static ObjectInputStream input;
	@Override
	public void run() {
		try {
			server = new ServerSocket(5678,10);
			while(true) {
			connection = server.accept();	
			output = new ObjectOutputStream(connection.getOutputStream());			
			input = new ObjectInputStream(connection.getInputStream());
			output.writeObject("You sent: "+(String)input.readObject());
			}
		} catch (UnknownHostException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}
  
}
