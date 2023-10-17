package tictac_sincronizadoGruposVersionA;

public class Tac  extends Thread{
 
	@Override
	public void run() {
		while (true) {
			if (Reloj.getNombreTurno().equals(currentThread().getName())) {
				System.out.println("Tac");
				Reloj.avanzaEstado();
			}
		}
	}
}
