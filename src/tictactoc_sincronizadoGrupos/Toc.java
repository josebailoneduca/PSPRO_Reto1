package tictactoc_sincronizadoGrupos;

public class Toc  extends Thread{
 
	@Override
	public void run() {
		while (true) {
			//comprueba si es su turno
			if (Sincronizador.getNombreTurno().equals(currentThread().getName())) {
				System.out.println("Toc");
				//ordena al sincronizador que pase al siguiente
				Sincronizador.siguiente();
			}
		}
	}
}
