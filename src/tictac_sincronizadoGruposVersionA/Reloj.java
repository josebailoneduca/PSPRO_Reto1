package tictac_sincronizadoGruposVersionA;


/**
 * Establece de manera estricta a que hebra le toca.
 * Para ver version con alternancia estricta solo de grupos y competicion
 * de hebras dentro de cada  grupo ver la version tictac_sincronizadoGruposVersionB
 */
public class Reloj {
	/**
	 * turno de hebra
	 */
	private static String turno="Tic1";
	
	/**
	 * Devuelve el turno actual
	 * @return
	 */
	public static String getNombreTurno() {
		return turno;
	}

	/**
	 * Avanza el estado a lo largo de la secuencia de turnos
	 */
	public static void avanzaEstado() {
		switch (turno) {
		case "Tic1":
			turno="Tac1";
			break;
		case "Tac1":
			turno="Tic2";
			break;
		case "Tic2":
			turno="Tac2";
			break;
		case "Tac2":
			turno="Tic1";
			break;
			}		
	}

}
