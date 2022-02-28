package pg01.c01;

class caso1 {

	public static void main(String[] args) {
		
		Thread hilo_x = new Thread(new ThreadX());
		Thread hilo_o = new Thread(new ThreadO());
		Thread hilo__ = new Thread(new Thread_());
		
		//Ejecucion no determinista
		hilo_x.start();
		hilo_o.start();
		hilo__.start();
		
		//Ejecucion determinista: .run()
		
	}

}
