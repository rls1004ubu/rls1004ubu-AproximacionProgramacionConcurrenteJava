package pg01.c01;

public class ThreadO implements Runnable{

	@Override
	public void run() {

		for(int i=0; i<100; i++) {
			System.out.print("o ");
		}
		System.out.println();

	}

}
