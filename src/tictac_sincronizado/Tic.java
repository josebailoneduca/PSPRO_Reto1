package tictac_sincronizado;

public class Tic  extends Thread{

	@Override
	public void run() {
		while (true) {
			if (Reloj.getEstado()==0) {
				System.out.println("Tic");
				Reloj.setEstado(1);
			}
		}
	}
}
