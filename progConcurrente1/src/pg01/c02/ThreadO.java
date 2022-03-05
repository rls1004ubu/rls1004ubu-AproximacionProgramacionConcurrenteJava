package pg01.c02;

public class ThreadO implements Runnable{

	@Override
	public void run() {

		for(int i=0; i<100; i++) {
			
			for(int j = 0; j<100000; j++) {
				System.out.print("o ");
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		
		}
		
		System.out.println();

	}

}
