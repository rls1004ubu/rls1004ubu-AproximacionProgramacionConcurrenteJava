package pg01.c03;

public class Hilo implements Runnable {

	private char caracter;
	private int tiempo_sleep;
	private int num_iteraciones;
	
	public Hilo(char caracter, int tiempo_sleep, int num_iteraciones) {
		this.caracter = caracter;
		this.tiempo_sleep = tiempo_sleep;
		this.num_iteraciones = num_iteraciones;
	}
	
	@Override
	public void run() {

		for(int i=0; i<num_iteraciones; i++) {
			for(int j=0; j<num_iteraciones*10; j++) {
				System.out.print(caracter);
			}
			try {
				Thread.sleep(tiempo_sleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		
	}

}
