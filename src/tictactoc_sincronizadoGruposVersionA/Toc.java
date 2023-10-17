package tictactoc_sincronizadoGruposVersionA;

public class Toc  extends Thread{
 
	@Override
	public void run() {
		while (true) {
			//comprueba si es su turno
			if (Reloj.getNombreTurno().equals(currentThread().getName())) {
				System.out.println("Toc");
				//ordena al sincronizador que pase al siguiente
				Reloj.siguiente();
			}
		}
	}
}
