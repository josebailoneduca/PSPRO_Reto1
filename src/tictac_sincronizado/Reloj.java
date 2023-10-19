package tictac_sincronizado;

public class Reloj {
	private static int estado = 0;

	public static int getEstado() {
		Thread.currentThread().yield();
		return estado;
	}

	public static void setEstado(int estado) {
		Reloj.estado = estado;
		Thread.yield();
	}
}
