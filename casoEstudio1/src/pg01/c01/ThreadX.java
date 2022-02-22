package pg01.c01;

public class ThreadX implements Runnable{

	@Override
	public void run() {

		for(int i=0; i<100; i++) {
			
			/*if(i == 2) {
				Thread.yield();
			}*/
			
			System.out.print("x ");
			
		}
		System.out.println();
		
	}

}
