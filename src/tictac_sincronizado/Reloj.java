package tictac_sincronizado;

public class Reloj {
	private static int estado = 0;

	public static int getEstado() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return estado;
	}

	public static void setEstado(int estado) {
		Reloj.estado = estado;
		Thread.yield();
	}
}
