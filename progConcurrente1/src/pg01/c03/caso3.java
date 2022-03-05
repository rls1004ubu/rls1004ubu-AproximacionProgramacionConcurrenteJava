package pg01.c03;

public class caso3 {

	public static void main(String[] args) {

		Thread hilo_x = new Thread(new Hilo('x',10000,100));
		Thread hilo_o = new Thread(new Hilo('o',10000,100));
		Thread hilo__ = new Thread(new Hilo('-',10000,100));
		
//		hilo_x.setPriority(7);
		hilo_x.start();
//		hilo_x.setPriority(5);
		hilo_o.start();
//		hilo__.setPriority(2);
		hilo__.start();
		
	}

}
