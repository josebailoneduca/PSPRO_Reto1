package tictac_sincronizadoGrupos;

public class Tac  extends Thread{
 
	@Override
	public void run() {
		while (true) {
			if (Sincronizador.getNombreTurno().equals(currentThread().getName())) {
				System.out.println("Tac");
				Sincronizador.avanzaEstado();
			}
		}
	}
}
