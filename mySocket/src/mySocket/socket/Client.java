package mySocket.socket;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
//import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client extends JFrame implements Runnable{
	private  static Socket connection;
	private static ObjectOutputStream output;
	private static ObjectInputStream input;
	
	public Client(String name)	
	{
	 super(name);
	 setLayout(new FlowLayout());
	 setSize(300,150);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setLocationRelativeTo(null);	 
	 final JTextField t1 = new JTextField(10);
	 final JButton b1 = new JButton("Send");
	 b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1) 
			{
				sendData(t1.getText());
			}
			
		}
	});
	 add(t1);
	 add(b1);
	 //this.run();
	 setVisible(true);
	}	
	
	@Override
	public void run() {
		try {
			
			while(true) {
			connection = new Socket(InetAddress.getByName("localhost"), 5678);	
			output = new ObjectOutputStream(connection.getOutputStream());			
			input = new ObjectInputStream(connection.getInputStream());
			String mes = (String)input.readObject();
			System.out.println("!");
			//JOptionPane.showMessageDialog(this, (String)input.readObject());			 
			JOptionPane.showMessageDialog(this, mes);
			}
		} catch (UnknownHostException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch(Exception e){System.out.println(e.getMessage());}
		
	}
	private static void sendData(Object obj) {
		try {
			output.flush();
			output.writeObject(obj);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}   

}
