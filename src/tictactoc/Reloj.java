package tictactoc;

/**
 * Define el turno de los grupos
 */
public class Reloj {

	/**
	 * Numero de impresiones a realizar
	 */
	private static long impresiones = -1;

	/**
	 * Nombre del grupo al que le toca el turno
	 */
	private static String turno = "grupoTic";

	/**
	 * Devuelve el turno actual
	 * 
	 * @return El turno actual
	 */
	public static String getTurno() {
		return turno;
	}

	/**
	 * Avanza en la secuencia de turnos
	 */
	public static void avanzaTurno() {

		// decrementar impresiones restantes
		if (impresiones > 0)
			Reloj.impresiones--;
		// si no quedan impresiones el programa termina
		if (impresiones == 0)
			System.exit(0);

		// Avanzar el turno
		switch (turno) {
		case "grupoTic":
			turno = "grupoTac";
			break;
		case "grupoTac":
			turno = "grupoToc";
			break;
		default:
			turno = "grupoTic";
		}

	}

	/**
	 * Define cuantas impresiones va a realizar el rejoj
	 * 
	 * @param n Numero de impresiones
	 */
	public static void setImpresiones(long n) {
		impresiones = n;
	}

}
