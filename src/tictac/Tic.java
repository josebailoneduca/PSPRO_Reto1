package tictac;

public class Tic  extends Thread{

	@Override
	public void run() {
		while (true) {
			System.out.println("Tic");
		}
	}
}
