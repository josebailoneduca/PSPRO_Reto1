package tictac_sincronizadoGrupos;

public class Tic  extends Thread{

	@Override
	public void run() {
		while (true) {
			if (Sincronizador.getEstado()==0) {
				System.out.println("Tic");
				Sincronizador.setEstado(1);
			}
		}
	}
}
