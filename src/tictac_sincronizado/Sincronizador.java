package tictac_sincronizado;

public class Sincronizador {
	private static int estado=0;

	public static int getEstado() {
		return estado;
	}

	public static void setEstado(int estado) {
		Sincronizador.estado = estado;
	}

}
