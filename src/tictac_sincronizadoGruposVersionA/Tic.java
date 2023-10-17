package tictac_sincronizadoGruposVersionA;

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
