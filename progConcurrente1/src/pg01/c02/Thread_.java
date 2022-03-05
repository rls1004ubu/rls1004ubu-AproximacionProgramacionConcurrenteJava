package pg01.c02;

public class Thread_ implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			
			for(int j = 0; j<100000; j++) {
				System.out.print("- ");
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
