package tictac_sincronizadoGrupos;

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
