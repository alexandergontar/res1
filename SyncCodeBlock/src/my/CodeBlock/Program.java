package my.CodeBlock;


import java.util.ArrayList;
import java.util.Comparator;

public class Program {

	public static void main(String[] args) {
	  Worker w1 = new Worker("Tobik");
	  Worker w2 = new Worker("Bobik");
	  Worker w3 = new Worker("Barabek");
       ArrayList<Worker> workers = new ArrayList<Worker>();
	  workers.add(w1);
	  workers.add(w2);
	  workers.add(w3);
	 // workers.get(0).start();
	  for (Worker w : workers) {
		  System.out.println(w.getName());
	  }
	  
      Comparator <Worker> comp = new Comparator<Worker>() {
			public int compare(Worker o1, Worker o2) {			
			return o1.start()-o2.start();
		  }
	     };
	     
	   Comparator <Worker>  comp1 =(o1,o2)->o1.start()-o2.start();
	     
	    //workers.sort(comp);
	    workers.sort(comp1.reversed());
	   // workers.sort((o1, o2)->o1.start()-o2.start());
	    
		  for (Worker w : workers) {
			  System.out.println(w.getName());
		  }	
	}
}
