package pg01.c02;

public class ThreadX implements Runnable{

	@Override
	public void run() {

		for(int i=0; i<1000000; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			for(int j = 0; j<50000; j++) {
				System.out.print("x ");
			}
			
		}
		System.out.println();
		
	}

}
