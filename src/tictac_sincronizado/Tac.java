package tictac_sincronizado;

public class Tac  extends Thread{

	@Override
	public void run() {
		while (true) {
			if (Reloj.getEstado()==1) {
				System.out.println("Tac");
				Reloj.setEstado(0);
 				
			}
		}
	}
}
