package tictac_sincronizadoGrupos;

public class Tic  extends Thread{
	@Override
	public void run() {
		while (true) {
			if (Sincronizador.getNombreTurno().equals(currentThread().getName())) {
				System.out.println("Tic");
				Sincronizador.avanzaEstado();

				
			}
		}
	}
}
