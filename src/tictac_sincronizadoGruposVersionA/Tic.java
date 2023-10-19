package tictac_sincronizadoGruposVersionA;

/**
 * Escribe Tic en pantalla cuando le toca
 */
public class Tic  extends Thread{
	@Override
	public void run() {
		while (true) {
			if (Reloj.getNombreTurno().equals(currentThread().getName())) {
				System.out.println("Tic");
				Reloj.avanzaEstado();

				
			}
		}
	}
}
