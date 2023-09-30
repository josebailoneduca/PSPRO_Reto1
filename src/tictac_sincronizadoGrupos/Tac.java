package tictac_sincronizadoGrupos;

public class Tac  extends Thread{

	@Override
	public void run() {
		while (true) {
			if (Sincronizador.getEstado()==1) {
				System.out.println("Tac");
				Sincronizador.setEstado(0);
			}
		}
	}
}
