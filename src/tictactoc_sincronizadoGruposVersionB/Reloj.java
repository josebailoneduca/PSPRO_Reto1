package tictactoc_sincronizadoGruposVersionB;


/**
 * Define el turno de los grupos
 */
public class Reloj {
	
	/**
	 * Nombre del grupo al que le toca el turno
	 */
	private static String turno="grupoTic";
	
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
		switch (turno) {
		case "grupoTic":
			turno="grupoTac";
			break;
		case "grupoTac":
			turno="grupoToc";
			break;
		default :
			turno="grupoTic";
			}		
	}

}
