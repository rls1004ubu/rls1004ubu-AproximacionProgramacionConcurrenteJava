package pg01.c02;

public class ThreadX implements Runnable{

	@Override
	public void run() {

		for(int i=0; i<100; i++) {
			
			for(int j = 0; j<100000; j++) {
				System.out.print("x ");
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println();
		
	}

}
