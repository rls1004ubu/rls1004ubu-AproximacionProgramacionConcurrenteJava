package pg01.c04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class caso4 {

	private static ExecutorService executor = Executors.newFixedThreadPool(3);
	
	public static void main(String[] args) {

		Thread hilo_x=new Thread(new Hilo('x',10000,100));
		Thread hilo_o=new Thread(new Hilo('o',10000,100));
		Thread hilo__=new Thread(new Hilo('-',10000,100));
		
		executor.execute(hilo_x);
		executor.execute(hilo_o);
		executor.execute(hilo__);

	}

}
