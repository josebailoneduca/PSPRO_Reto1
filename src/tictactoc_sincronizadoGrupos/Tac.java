package tictactoc_sincronizadoGrupos;

public class Tac  extends Thread{
 
	@Override
	public void run() {
		while (true) {
			//comprueba si es su turno
			if (Sincronizador.getNombreTurno().equals(currentThread().getName())) {
				System.out.println("Tac");
				//ordena al sincronizador que pase al siguiente
				Sincronizador.siguiente();
			}
		}
	}
}