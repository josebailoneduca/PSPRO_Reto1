package tictac_sincronizadoGruposVersionA;


public class Reloj {
	private static String turno="Tic1";
	
	public static String getNombreTurno() {
		return turno;
	}

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
