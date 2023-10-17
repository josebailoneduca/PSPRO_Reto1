package tictactoc_sincronizadoGruposVersionA;

public class Tac  extends Thread{
 
	@Override
	public void run() {
		while (true) {
			//comprueba si es su turno
			if (Reloj.getNombreTurno().equals(currentThread().getName())) {
				System.out.println("Tac");
				//ordena al sincronizador que pase al siguiente
				Reloj.siguiente();
			}
		}
	}
}
