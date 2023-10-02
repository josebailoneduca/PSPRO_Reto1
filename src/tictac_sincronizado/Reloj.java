package tictac_sincronizado;

public class Sincronizador {
	private static int estado=0;

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
		Sincronizador.estado = estado;
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
