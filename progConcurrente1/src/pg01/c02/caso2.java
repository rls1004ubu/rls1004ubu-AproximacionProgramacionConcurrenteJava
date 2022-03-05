package pg01.c02;

public class caso2 {

	public static void main(String[] args) {

		Thread hilo_x = new Thread(new ThreadX());
		Thread hilo_o = new Thread(new ThreadO());
		Thread hilo__ = new Thread(new Thread_());
		
		//Ejecucion no determinista
		hilo_x.start();
		hilo_o.start();
		hilo__.start();
		
		
		/*Si los hilos tienen el mismo tiempo de espera, muestran los caracteres uno por uno hasta finalizar
		 * 
		 * Si no tienen el mis mo tiempo de espera se muestran antes los que menor tiempo de espera tenga
		 */
		
	}

}
