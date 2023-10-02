package tictactoc_sincronizadoGrupos;

public class Tic  extends Thread{
	@Override
	public void run() {
		while (true) {
			//comprueba si es su turno
			if (Reloj.getNombreTurno().equals(currentThread().getName())) {
				System.out.println("Tic");
				//ordena al sincronizador que pase al siguiente
				Reloj.siguiente();
			}
		}
	}
}
